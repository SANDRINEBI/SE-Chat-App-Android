package com.gigster.semessaging;

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
import com.firebase.client.ValueEventListener;
import com.gigster.semessaging.gigs.Datum;
import com.gigster.semessaging.gigs.GigList;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.common.collect.Lists;
import com.google.common.collect.TreeMultiset;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import butterknife.OnClick;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    Firebase db;
//    TreeMultiset<Chat> chats;
    FixSizeArrayList chats;
    ChatListAdapter adapter;
    Comparator chatComparator;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        db = new Firebase("https://gigster-debo.firebaseio.com/messages/");
        SharedPreferences settings = getSharedPreferences("settings", 0);
        boolean loggedIn = settings.getBoolean("loggedIn", false);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (!loggedIn) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        chats = new FixSizeArrayList(30);
        chatComparator= new  Comparator<Chat>() {
            @Override
            public int compare(Chat c1, Chat c2)
            {

                return  Long.valueOf(c1.getMillisSinceLastMessage()).compareTo(c2.getMillisSinceLastMessage());
            }

        };
//                TreeMultiset.create(new Comparator<Chat>() {
//            @Override
//            public int compare(Chat c1, Chat c2)
//            {
//
//                return  Long.valueOf(c1.getMillisSinceLastMessage()).compareTo(c2.getMillisSinceLastMessage());
//            }
//        });

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

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Chat c = (Chat) data.getExtras().getSerializable("Chat");
        if (c==null)
            return;
        chats.set(requestCode, c);
        GetGigsTask task = new GetGigsTask();
        task.execute();
        adapter.notifyDataSetChanged();
    }

    @OnClick(R.id.settingsDots)
    public void logoutAndReset(View v){
        Context context = getApplicationContext();
        Intent mStartActivity = new Intent(context, MainActivity.class);
        int mPendingIntentId = 123456;
        PendingIntent mPendingIntent = PendingIntent.getActivity(context, mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager mgr = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
        SharedPreferences settings = getSharedPreferences("settings", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
        finish();
    }

    @Override
    public void onStart() {
        super.onStart();

        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);

        GetGigsTask task = new GetGigsTask();
        task.execute();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gigster.semessaging/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public class GetGigsTask extends AsyncTask<Void, Void, GigList> {

        GetGigsTask() {

        }

        @Override
        protected GigList doInBackground(Void... params) {

            SharedPreferences settings = getSharedPreferences("settings", 0);
//            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//            OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor((okhttp3.Interceptor)logging).build();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://app.gigster.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            GigsterService serv = retrofit.create(GigsterService.class);
            String cookie = settings.getString("cookie", "");
            GigList gigs = null;
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
//                chats.clear();
                for (Datum d : gigs.getData()) {
                    if(d==null || d.getPoster()==null)
                        continue;
                    String img = d.getPoster().getImgURL();
                    if (img == null) {
                        img = "https://app.gigster.com/media/sprites/generic-avatars/av1.png";
                    }
                    Chat c = new Chat(img, d.getName(), d.getId());
                    if(chats.contains(c)){
                        c = chats.get(chats.indexOf(c));
                    }
                    final Chat ch = c;
                    final ArrayList<ChatMessage> chat = ch.getChat();
                    final String gigID = ch.getGigID();
                    if(chat.size()==0) {
                        db.child(gigID).orderByChild("timestamp").limitToLast(1).addChildEventListener(new ChildEventListener() {
                            @Override
                            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                                HashMap val = (HashMap) dataSnapshot.getValue();
                                ChatMessage msg = new ChatMessage(val,gigID);
                                if (new Date().getTime()-msg.getTimestamp()>1000000000)
                                    return;
                                chat.add(msg);
                                if(!chats.contains(ch)){
                                    chats.insertOrdered(ch);
                                }
                                adapter.sort(chatComparator);
                                adapter.notifyDataSetChanged();
                            }

                            @Override
                            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

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
                        });
                    }
                }
                adapter.notifyDataSetChanged();
            } else {
                Log.d("Status", "failed to load chat");
            }
        }

        @Override
        protected void onCancelled() {

        }
    }
}
