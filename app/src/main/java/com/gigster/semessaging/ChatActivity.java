package com.gigster.semessaging;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.desmond.asyncmanager.AsyncManager;
import com.desmond.asyncmanager.TaskRunnable;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.Manifest.permission.CALL_PHONE;

public class ChatActivity extends AppCompatActivity {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private ListView lv;
    private static final int REQUEST_CALL_PHONE = 0;
    ArrayList<ChatMessage> messages = new ArrayList<ChatMessage>();
    ChatAdapter adapter;
    ChildEventListener listener;
    Chat chat;
    Firebase db;
    boolean inActivity = false;
    AppCompatActivity activity = this;
    SharedPreferences settings;
    String myID;
    @Bind(R.id.editText)
    EditText text;
    @Bind(R.id.call)
    ImageView call;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        settings = getSharedPreferences("settings", 0);
        myID = settings.getString("userid", "");
        db = new Firebase("https://gigster-debo.firebaseio.com/messages/");
        ButterKnife.bind(this);
        chat = new Chat();
        try {
            chat = (Chat) getIntent().getSerializableExtra("Chat");
        } catch (Exception e) {

        }
        Date d = new Date();

        TextView title = (TextView) findViewById(R.id.chatName);
        if (chat != null) {
            title.setText(chat.getChatName());
            messages = chat.getChat();
            adapter = new ChatAdapter(this, messages);
        } else
            adapter = new ChatAdapter(this);
        lv = (ListView) findViewById(R.id.chatListView);

        lv.setAdapter(adapter);
        messages.clear();
        listener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {


                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val, chat.getGigID(), myID, dataSnapshot.getKey());
                if (!msg.getType().equals("typing")) {
                    messages.add(msg);
                    adapter.notifyDataSetChanged();
                    final ChatMessage ms = msg;
                    if (!msg.isRead()&& inActivity)
                        scheduler.schedule(new Runnable(){
                            @Override
                            public void run(){
                                Firebase message = db.child(chat.getGigID()).child(ms.getMessageKey());
                                ArrayList read = ms.getReadSnippets();
                                ms.readIt();
                                read = ms.getReadSnippets();
                                Map<String, Object> readMap = new HashMap<>();
                                readMap.put("read", read);
                                message.updateChildren(readMap);
                            }
                        }, 1, TimeUnit.SECONDS);

                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val, chat.getGigID(), myID, dataSnapshot.getKey());
                if (messages.contains(msg)) {
                    messages.set(messages.indexOf(msg), msg);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val, chat.getGigID(), myID, dataSnapshot.getKey());
                if (messages.contains(msg)) {
                    messages.remove(messages.indexOf(msg));
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        };


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void sendMessage(ChatMessage msg) {
        AsyncManager.runBackgroundTask(new TaskRunnable<ChatMessage, Boolean, Void>() {
            @Override
            public Boolean doLongOperation(ChatMessage params) throws InterruptedException {
                SharedPreferences settings = getSharedPreferences("settings", 0);
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(getString(R.string.base_url))
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                GigsterService serv = retrofit.create(GigsterService.class);
                String cookie = settings.getString("cookie", "");
                Call<Object> sendMessage = serv.sendMessage(cookie, params.getGigID(), params.getText(), params.getType(), params.isMine());
                try {
                    Response<Object> resp = sendMessage.execute();
                    if (resp.code() == 200) {

                        return true;
                    } else {
                        Log.d("SendMessageTask Error", resp.errorBody().string());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


                return true;
            }
        }.setParams(msg));
    }

    @OnClick(R.id.send)
    public void addItems(View v) {
        String message = text.getText().toString();
        if (message.length() <= 0)
            return;

        message = message.trim();
        String emoij = EmojiParser.demojizedText(message);
        ChatMessage msg = new ChatMessage(emoij, new Date(), true, "text", chat.getGigID(), myID);

        sendMessage(msg);

        text.setText("", TextView.BufferType.EDITABLE);
    }

    private boolean mayRequestCall() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }
        if (checkSelfPermission(CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        if (shouldShowRequestPermissionRationale(CALL_PHONE)) {
            Snackbar.make(call, R.string.permission_rationale, Snackbar.LENGTH_INDEFINITE)
                    .setAction(android.R.string.ok, new View.OnClickListener() {
                        @Override
                        @TargetApi(Build.VERSION_CODES.M)
                        public void onClick(View v) {
                            requestPermissions(new String[]{CALL_PHONE}, REQUEST_CALL_PHONE);
                        }
                    });
        } else {
            requestPermissions(new String[]{CALL_PHONE}, REQUEST_CALL_PHONE);
        }
        return false;
    }

    /**
     * Callback received when a permissions request has been completed.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL_PHONE) {
            if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makeCall();
            }
        }
    }

    public void makeCall() {
        String number = chat.getPhoneNumber();
        Context context = getApplicationContext();

        if (!mayRequestCall())
            return;
        if (context.checkCallingOrSelfPermission(CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
            if (number == null) {
                ErrorDialog alert = new ErrorDialog();
                alert.setDialogInfo("Call Failed", "No number on file");
                alert.show(getFragmentManager(), "ErrorDialog");
            } else {
                String uri = "tel:" + number.trim();
                SharedPreferences settings = getSharedPreferences("settings", 0);
                String email = settings.getString("email", "");
                ChatMessage msg = new ChatMessage(email + ", had a phone call with client", new Date(), true, "phonecall", chat.getGigID(), myID);
                sendMessage(msg);
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        else {

            ErrorDialog alert = new ErrorDialog();
            alert.setDialogInfo("Call Failed", "Permission not granted");
            alert.show(getFragmentManager(), "ErrorDialog");
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Chat Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
        db.child(chat.getGigID()).orderByChild("timestamp").addChildEventListener(listener);
        inActivity = true;
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Chat Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
        db.removeEventListener(listener);
        inActivity = false;
    }

    public static class ErrorDialog extends DialogFragment {
        String dialogName;
        String dialogMessage;

        public void setDialogInfo(String name, String message) {
            dialogName = name;
            dialogMessage = message;

        }

        public Dialog onCreateDialog(Bundle savedInstance) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
            builder.setTitle(dialogName);
            builder.setMessage(dialogMessage);
            builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            return builder.create();
        }
    }

    @OnClick(R.id.call)
    public void call(View v) {
        Context context = v.getContext();
        makeCall();
    }

    @OnClick(R.id.backArrow)
    public void back(View v) {
        int resultCode = 200;
        Intent resultIntent = new Intent();
        resultIntent.putExtra("Chat", chat);
        setResult(resultCode, resultIntent);
        finish();
    }

    @OnClick(R.id.info)
    public void showInfo(View v) {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("Chat", chat);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        int resultCode = 200;
        Intent resultIntent = new Intent();
        resultIntent.putExtra("Chat", chat);
        setResult(resultCode, resultIntent);
        finish();
    }
}
