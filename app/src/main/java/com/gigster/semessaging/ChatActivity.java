package com.gigster.semessaging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChatActivity extends AppCompatActivity {
    private ListView lv;
    ArrayList<ChatMessage> messages= new ArrayList<ChatMessage>();
    ChatAdapter adapter;
    Chat chat;
    @Bind(R.id.editText) EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    }
    @OnClick(R.id.send)
    public void addItems(View v) {
        String message = text.getText().toString();
        if(message.length()<=0)
            return;

        message = message.trim();
        String emoij = EmojiParser.demojizedText(message);
        ChatMessage msg = new ChatMessage(emoij, new Date(), true);
        messages.add(msg);

        adapter.notifyDataSetChanged();


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
