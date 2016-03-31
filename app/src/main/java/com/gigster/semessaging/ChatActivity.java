package com.gigster.semessaging;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.desmond.asyncmanager.AsyncManager;
import com.desmond.asyncmanager.TaskRunnable;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
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

public class ChatActivity extends AppCompatActivity {
    private ListView lv;
    ArrayList<ChatMessage> messages= new ArrayList<ChatMessage>();
    ChatAdapter adapter;
    Chat chat;
    Firebase db;
    @Bind(R.id.editText) EditText text;

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
                Call<Object> sendMessage = serv.sendMessage(cookie,params.getGigID(),params.getText(),params.getType(), params.isMine());
                try {
                    Response<Object> resp = sendMessage.execute();
                    if (resp.code() == 200) {
                        Log.d("SendMessageTask", "Successfully sent message");

                        return true;
                    }
                    else{
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
