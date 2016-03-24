package com.gigster.semessaging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private boolean loggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(!loggedIn){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        ArrayList<Chat> chats= new ArrayList<>();
        chats.add(new Chat("http://dreamatico.com/data_images/kitten/kitten-3.jpg", "Kitten 1 / Kittens are Us", "Did you get our litter?", 1));
        chats.add(new Chat("https://catlovers2015.files.wordpress.com/2015/05/cute-kitten-kittens-16123158-1280-800.jpg", "Kitten 2 / Kittens aren't Us", "You're late!", 2));
        chats.add(new Chat("http://vignette4.wikia.nocookie.net/happypasta/images/6/6c/Anime-kittens-cats-praying-496315.jpg/revision/latest?cb=20130914024839", "Kitten 3 / Give us Dogs", "Perfect!", 0));
        chats.add(new Chat());
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ChatListAdapter(this,R.id.listView, chats));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Chat entry = (Chat) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("Chat", entry);
                startActivity(intent);
            }
        });

    }

}
