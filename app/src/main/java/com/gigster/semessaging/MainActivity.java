package com.gigster.semessaging;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.gigster.semessaging.gigs.Datum;
import com.gigster.semessaging.gigs.GigList;
import com.gigster.semessaging.gigs.Poster;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import net.danlew.android.joda.JodaTimeAndroid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    Firebase db;
    ArrayList<Chat> chats;
    ArrayList<Chat> temp;
    ChatListAdapter adapter;
    ArrayList<ChildEventListener> listeners;
    Context appContext;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        JodaTimeAndroid.init(this);
        appContext = this;
        db = new Firebase("https://gigster-debo.firebaseio.com/messages/");
        SharedPreferences settings = getSharedPreferences("settings", 0);
        boolean loggedIn = settings.getBoolean("loggedIn", false);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (!loggedIn) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        chats = new ArrayList<>();
        temp = new ArrayList<>();
        listeners = new ArrayList<>();

        lv = (ListView) findViewById(R.id.listView);
        adapter = new ChatListAdapter(this, R.id.listView, chats);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Chat entry = (Chat) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("Chat", entry);
                startActivityForResult(intent, position);
            }
        });

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void updateContent() {
        Collections.sort(temp);
        adapter.clear();
        ArrayList<Chat> subList;// = new ArrayList(temp.subList(0,30));
        if(temp.size()>30)
            subList = new ArrayList(temp.subList(0,30));//adapter.addAll(sublist);
        else
            subList = temp;//adapter.addAll(temp);

        for(Chat c: subList){
            c.updateUrgency();
        }

        adapter.addAll(subList);

        adapter.notifyDataSetChanged();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Chat c = (Chat) data.getExtras().getSerializable("Chat");
        if (c==null)
            return;
        c.updateUrgency();
        temp.set(temp.indexOf(c), c);
        updateContent();
        GetGigsTask task = new GetGigsTask();
        task.execute();
        adapter.notifyDataSetChanged();
    }

    @OnClick(R.id.settingsDots)
    public void settings(View v){
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();

        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW,
                "Main Page",
                Uri.parse("http://host/path"),
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);

        GetGigsTask task = new GetGigsTask();
        task.execute();
        updateContent();
    }

    @Override
    public void onStop() {
        super.onStop();

        Action viewAction = Action.newAction(
                Action.TYPE_VIEW,
                "Main Page",
                Uri.parse("http://host/path"),
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public class GetGigsTask extends AsyncTask<Void, Void, GigList> {

        @Override
        protected GigList doInBackground(Void... params) {

            SharedPreferences settings = getSharedPreferences("settings", 0);
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(getString(R.string.base_url))
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            GigsterService serv = retrofit.create(GigsterService.class);
            String cookie = settings.getString("cookie", "");
            Call<GigList> gigsRequest = serv.getSeGigs(cookie);
            try {
                Response<GigList> resp = gigsRequest.execute();
                if (resp.code() == 200) {
                    Log.d("GetGigsTask", "Successfully retrieved SE gigs");
                    return resp.body();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
        @Override
        protected void onPostExecute(final GigList gigs) {

            if (gigs != null) {
                SharedPreferences settings = getSharedPreferences("settings", 0);
                final String myID = settings.getString("userid", "");
                List<Datum> datums = gigs.getData();
                Collections.sort(datums);
                Collections.reverse(datums);
                final int size = datums.size();
                int index = 0;
                for (Datum d : datums) {
                    if(d==null || d.getPoster()==null || d.isStale())
                        continue;
                    Poster p = d.getPoster();
                    String img = p.getImgURL();
                    final String phone = p.getPhone();
                    if (img == null) {
                        img = "https://app.gigster.com/media/sprites/generic-avatars/av1.png";
                    }
                    Chat c = new Chat(img, d.getName(), d.getId());
                    if(phone!=null)
                        c = new Chat(img, d.getName(), d.getId(), phone);
                    if(temp.contains(c)){
                        c = temp.get(temp.indexOf(c));
                    }
                    final int ind = index;
                    final Chat ch = c;
                    final ArrayList<ChatMessage> chat = ch.getChat();
                    final String gigID = ch.getGigID();
                    ChildEventListener listener = new ChildEventListener() {
                        @Override
                        public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                            HashMap val = (HashMap) dataSnapshot.getValue();
                            ChatMessage msg = new ChatMessage(val, gigID, myID, dataSnapshot.getKey());

                            if(!temp.contains(ch))
                                temp.add(ch);

                            if(!chat.contains(msg))
                            {
                                if(!msg.getType().equals("typing")) {
                                    chat.add(msg);
                                    Log.d(String.valueOf(Math.floor(size * 0.9)), String.valueOf(temp.size()));
                                    updateContent();
                                    Log.d("Content Added", String.valueOf(temp.size()));
                                }
                            }
                        }

                        @Override
                        public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                            Log.d("Child", "changed in MAIN");
                            HashMap val = (HashMap) dataSnapshot.getValue();
                            ChatMessage msg = new ChatMessage(val, gigID, myID, dataSnapshot.getKey());

                            if(!temp.contains(ch))
                                temp.add(ch);

                            if(!chat.contains(msg))
                            {
                                chat.add(msg);
                                Log.d(String.valueOf(Math.floor(size*0.9)), String.valueOf(temp.size()));
                                updateContent();
                                Log.d("Content Added", String.valueOf(temp.size()));
                            }
                            else{
                                chat.set(chat.indexOf(msg), msg);
                                updateContent();
                                Log.d("Existing Updated", String.valueOf(temp.size()));
                            }

                        }

                        @Override
                        public void onChildRemoved(DataSnapshot dataSnapshot) {

                        }

                        @Override
                        public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                        }

                        @Override
                        public void onCancelled(FirebaseError firebaseError) {

                        }
                    };

                    db.child(gigID).orderByChild("timestamp").limitToLast(1).addChildEventListener(listener);

                    listeners.add(listener);

                    index++;
                }
            } else {
                Log.d("Status", "failed to load chat");
                SharedPreferences settings = getSharedPreferences("settings", 0);
                String myID = settings.getString("userID", "");
                Log.d("Status", myID);

            }
        }

        @Override
        protected void onCancelled() {

        }
    }


}
