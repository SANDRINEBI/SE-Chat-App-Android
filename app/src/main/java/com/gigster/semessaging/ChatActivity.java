package com.gigster.semessaging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChatActivity extends AppCompatActivity {
    private ListView lv;
    ArrayList<ChatMessage> messages= new ArrayList<>();
    ChatAdapter adapter;
    @Bind(R.id.editText) EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        Chat c = new Chat();
        try{
           c = (Chat) getIntent().getSerializableExtra("Chat");
        } catch (Exception e){

        }
        Date d = new Date();
        messages.add(new ChatMessage("How's it coming?", d, false));
        messages.add(new ChatMessage("Ahead of schedule! All cool?", d, true));
        messages.add(new ChatMessage("I'm just always curious", d, false));
        messages.add(new ChatMessage("You should be excited!", d, true));
        messages.add(new ChatMessage("It's going well!", d, true));
        messages.add(new ChatMessage("Glad to hear it!!!Glad to hear it!!!Glad to hear it!!!Glad to hear it!!!Glad to hear it!!!Glad to hear it!!!Glad to hear it!!!", d, false));
        messages.add(new ChatMessage("How's it coming?", d, false));
        messages.add(new ChatMessage("Ahead of schedule! All cool?", d, true));
        messages.add(new ChatMessage("I'm just always curious", d, false));
        messages.add(new ChatMessage("You should be excited!", d, true));
        messages.add(new ChatMessage("It's going well!", d, true));
        messages.add(new ChatMessage("Glad to hear it!!!", d, false));
        TextView title = (TextView) findViewById(R.id.chatName);
        if (c!=null) {
            Log.d("C", c.toString());
            title.setText(c.getChatName());
        }
        adapter = new ChatAdapter(this, R.id.chatListView, messages);
        lv = (ListView) findViewById(R.id.chatListView);
        lv.setAdapter(adapter);
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position,
//                                    long id) {
//                ChatMessage entry = (ChatMessage) parent.getItemAtPosition(position);
//            }
//        });

    }
    @OnClick(R.id.send)
    public void addItems(View v) {
        messages.add(new ChatMessage( text.getText().toString(),new Date(), true));
        text.setText("");
        adapter.notifyDataSetChanged();
    }

    @OnClick(R.id.backArrow)
    public void back(View v){
        finish();
    }

}
