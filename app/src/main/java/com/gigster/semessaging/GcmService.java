package com.gigster.semessaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.gigster.semessaging.gigs.Datum;
import com.gigster.semessaging.gigs.GigList;
import com.gigster.semessaging.gigs.Poster;
import com.google.android.gms.gcm.GcmListenerService;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GcmService extends GcmListenerService {
    private static final String TAG = "GcmListenerService";
    private String gigID = "";
    private Chat chat = new Chat();
    private Bitmap bm;
    private String message = "";
    private Target loadtarget;


    public void onMessageReceived(String from, Bundle data) {
        Log.d(TAG, "MessageReceived");

        Log.d(TAG, data.toString());
        String message = data.getString("message");
        String gigID = data.getString("gig");
        this.gigID = gigID;
        this.message = message;
        bm = BitmapFactory.decodeResource(getResources(), R.drawable.ic_notification);


        GetGigsTask task = new GetGigsTask();
        task.execute();


    }
    private void sendNotification(String message) {
        SharedPreferences settings = getSharedPreferences("settings", 0);
        boolean notifyPhone = settings.getBoolean("notifyPhone", true);
        boolean notifyWatch = settings.getBoolean("notifyWatch", false);
        if(!notifyPhone && ! notifyWatch)
            return;
        Intent intent = new Intent(getApplicationContext(), ChatActivity.class);
        intent.putExtra("Chat", chat);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder;
        if(notifyPhone)
            if(!notifyWatch)
                 notificationBuilder = new NotificationCompat.Builder(this)
                        .setLargeIcon(bm)
                        .setSmallIcon(R.drawable.ic_notification)
                        .setContentTitle("PoolDay")
                        .setContentText(message)
                        .setOngoing(true)
                        .setOnlyAlertOnce(true)
                        .setAutoCancel(true)
                        .setSound(defaultSoundUri)
                        .setContentIntent(pendingIntent)
                        .setGroup("GROUP")
                        .setGroupSummary(true);
            else
                notificationBuilder = new NotificationCompat.Builder(this)
                        .setLargeIcon(bm)
                        .setSmallIcon(R.drawable.ic_notification)
                        .setContentTitle("PoolDay")
                        .setContentText(message)
                        .setAutoCancel(true)
                        .setSound(defaultSoundUri)
                        .setContentIntent(pendingIntent);
        else
            notificationBuilder = new NotificationCompat.Builder(this)
                    .setLargeIcon(bm)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("PoolDay")
                    .setContentText(message)
                    .setAutoCancel(true)
                    .setSound(defaultSoundUri)
                    .setContentIntent(pendingIntent);


        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        if(notifyPhone || notifyWatch)
        notificationManager.notify(0, notificationBuilder.build());
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
                for (Datum d : datums) {
                    if(d==null || d.getPoster()==null || d.isStale())
                        continue;
                    if(!d.getId().equals(gigID))
                        continue;
                    Poster p = d.getPoster();
                    String img = p.getImgURL();
                    final String phone = p.getPhone();
                    if (img == null) {
                        img = "https://app.gigster.com/media/sprites/generic-avatars/av1.png";
                    }
                    chat = new Chat(img, d.getName(), d.getId());
                    if(phone!=null)
                        chat = new Chat(img, d.getName(), d.getId(), phone);

                    loadBitmap(img);
                    return;
                }
            } else {
                Log.d("Status", "failed to load chat");
            }
        }

        @Override
        protected void onCancelled() {

        }
    }
    public void loadBitmap(String url) {

        loadtarget = new Target() {
            @Override
            public void onPrepareLoad(Drawable d){

            }
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                // do something with the Bitmap
                handleLoadedBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Drawable d) {

            }
        };

        Picasso.with(this).load(url).into(loadtarget);
    }

    public void handleLoadedBitmap(Bitmap b) {
        bm = b;
        sendNotification(message);
    }
}
