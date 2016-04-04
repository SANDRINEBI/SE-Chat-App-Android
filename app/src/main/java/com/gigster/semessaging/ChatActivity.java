package com.gigster.semessaging;

import android.Manifest;
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
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
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
import com.firebase.client.ValueEventListener;
import com.gigster.semessaging.gigs.GigList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.xml.transform.Result;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission.PACKAGE_USAGE_STATS;
import static android.Manifest.permission.READ_CONTACTS;

public class ChatActivity extends AppCompatActivity {
    private ListView lv;
    private static final int REQUEST_CALL_PHONE = 0;
    ArrayList<ChatMessage> messages= new ArrayList<ChatMessage>();
    ChatAdapter adapter;
    Chat chat;
    Firebase db;
    AppCompatActivity activity = this;
    @Bind(R.id.editText) EditText text;
    @Bind(R.id.call) ImageView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        db = new Firebase("https://gigster-debo.firebaseio.com/messages/");
        ButterKnife.bind(this);
        chat = new Chat();
        try{
           chat = (Chat) getIntent().getSerializableExtra("Chat");
        } catch (Exception e){

        }
        Date d = new Date();
        TextView title = (TextView) findViewById(R.id.chatName);
        if (chat!=null) {
            title.setText(chat.getChatName());
            messages = chat.getChat();
            adapter = new ChatAdapter(this, messages);
        }
        else
            adapter = new ChatAdapter(this);
        lv = (ListView) findViewById(R.id.chatListView);

        lv.setAdapter(adapter);
        messages.clear();
        db.child(chat.getGigID()).orderByChild("timestamp").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val,chat.getGigID());

                Log.d("Child Added", msg.getText());
                if(!msg.getType().equals("typing")){
                    messages.add(msg);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val,chat.getGigID());
                Log.d("Child Changed", msg.getText());
                if (messages.contains(msg)){
                    messages.set(messages.indexOf(msg),msg);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                HashMap val = (HashMap) dataSnapshot.getValue();
                ChatMessage msg = new ChatMessage(val,chat.getGigID());
                Log.d("Child Removed", msg.getText());
                if (messages.contains(msg)){
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
        });

    }
    @OnClick(R.id.send)
    public void addItems(View v) {
        String message = text.getText().toString();
        if(message.length()<=0)
            return;

        message = message.trim();
        String emoij = EmojiParser.demojizedText(message);
        ChatMessage msg = new ChatMessage(emoij, new Date(), true, "text", chat.getGigID());

        AsyncManager.runBackgroundTask(new TaskRunnable<ChatMessage, Boolean, Void>() {
            @Override
            public Boolean doLongOperation(ChatMessage params) throws InterruptedException {
                SharedPreferences settings = getSharedPreferences("settings", 0);
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://app.gigster.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                GigsterService serv = retrofit.create(GigsterService.class);
                String cookie = settings.getString("cookie", "");
                Call<Object> sendMessage = serv.sendMessage(cookie, params.getGigID(), params.getText(), params.getType(), params.isMine());
                try {
                    Response<Object> resp = sendMessage.execute();
                    if (resp.code() == 200) {
                        Log.d("SendMessageTask", "Successfully sent message");

                        return true;
                    } else {
                        Log.d("SendMessageTask Error", resp.errorBody().string());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


                return true;
            }

            // Override this callback if you need to handle the result on the UI thread
            @Override
            public void callback(Boolean result) {
                // Handle the result from doLongOperation()
            }
        }.setParams(msg));

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
    public void makeCall(){
        String number = chat.getPhoneNumber();
        Context context = getApplicationContext();

        if(!mayRequestCall())
            return;
        if(context.checkCallingOrSelfPermission(CALL_PHONE)==PackageManager.PERMISSION_GRANTED)
            if(number==null)
            {
                ErrorDialog alert = new ErrorDialog();
                alert.setDialogInfo("Call Failed", "No number on file");
                alert.show(getFragmentManager(), "ErrorDialog");
                Log.d("Call Failed", "No Number");
            }else{
                String uri = "tel:" + number.trim() ;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
                Log.d("Call", "Succeeded");
            }
        else{

            ErrorDialog alert = new ErrorDialog();
            alert.setDialogInfo("Call Failed", "Permission not granted");
            alert.show(getFragmentManager(), "ErrorDialog");
            Log.d("Call Failed", "No Permission");
        }
    }

    public static class ErrorDialog extends DialogFragment{
        String dialogName;
        String dialogMessage;
        public void setDialogInfo(String name, String message){
            dialogName = name;
            dialogMessage = message;

        }
        public Dialog onCreateDialog(Bundle savedInstance){
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
    public void call(View v){
        Context context = v.getContext();
        makeCall();
    }

    @OnClick(R.id.backArrow)
    public void back(View v){
        int resultCode = 200;
        Intent resultIntent = new Intent();
        resultIntent.putExtra("Chat", chat);
        setResult(resultCode, resultIntent);
        finish();
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
