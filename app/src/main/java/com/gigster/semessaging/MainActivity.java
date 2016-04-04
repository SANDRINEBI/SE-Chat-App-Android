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
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.firebase.client.AuthData;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
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
import java.util.Comparator;
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
//    TreeMultiset<Chat> chats;
    ArrayList<Chat> chats;
    ArrayList<Chat> temp;
    ChatListAdapter adapter;
    ArrayList<ChildEventListener> listeners;
    Comparator chatComparator;
    boolean initialLoad = true;
    Context appContext;
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
                Log.d("Listeners", "cleared");
                startActivityForResult(intent, position);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void updateContent() {
        Collections.sort(temp);
        adapter.clear();
        if(temp.size()>30)
            adapter.addAll(new ArrayList(temp.subList(0,30)));
        else
            adapter.addAll(temp);
        adapter.notifyDataSetChanged();
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

    public boolean isTop(){
        Context c = getApplicationContext();
        return c.getPackageName().equalsIgnoreCase(((ActivityManager)c.getSystemService(Context.ACTIVITY_SERVICE)).getRunningTasks(1).get(0).topActivity.getPackageName());
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
                            ChatMessage msg = new ChatMessage(val, gigID);
                            if(!isTop()){

                                Intent resultIntent = new Intent(MainActivity.this, ChatActivity.class);
                                resultIntent.putExtra("Chat", ch);
                                PendingIntent resultPendingIntent =
                                        PendingIntent.getActivity(
                                                appContext,
                                                0,
                                                resultIntent,
                                                PendingIntent.FLAG_UPDATE_CURRENT
                                        );
                                NotificationCompat.Builder mBuilder =
                                        new NotificationCompat.Builder(appContext)
                                                .setSmallIcon(R.mipmap.ic_launcher)
                                                .setContentTitle(msg.getFirstName())
                                                .setContentText(msg.getText())
                                                .setContentIntent(resultPendingIntent);;

                            }

                            if(!temp.contains(ch))
                                temp.add(ch);

                            if(!chat.contains(msg))
                            {
                                chat.add(msg);
                                Log.d("Message Added", String.valueOf(temp.size()));
                                Log.d(String.valueOf(Math.floor(size*0.9)), String.valueOf(temp.size()));
//                                if(Math.floor(size * 0.9)<temp.size() || (ind>30)){
//                                if(Math.floor(size * 0.9)<temp.size() || (30<ind && ind<35)){
                                    updateContent();
                                    Log.d("Content Updated", String.valueOf(temp.size()));
//                                }
                            }
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
                    };

                    db.child(gigID).orderByChild("timestamp").limitToLast(1).addChildEventListener(listener);

                    listeners.add(listener);

                    index++;
                }
            } else {
                Log.d("Status", "failed to load chat");
            }
        }

        @Override
        protected void onCancelled() {

        }
    }


}
