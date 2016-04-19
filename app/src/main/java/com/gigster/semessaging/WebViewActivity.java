package com.gigster.semessaging;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import butterknife.OnClick;

public class WebViewActivity extends AppCompatActivity {
    Chat chat;
    String cookie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        chat = new Chat();
        try{
            chat = (Chat) getIntent().getSerializableExtra("Chat");
        } catch (Exception e){

        }
        SharedPreferences settings = getSharedPreferences("settings", 0);
        cookie = settings.getString("cookie", "");

        TextView title = (TextView) findViewById(R.id.chatName);
        title.setText(chat.getChatName());

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Cookie", cookie);
        WebView view = (WebView) findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyWebViewClient());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setCookie("https://app.gigster.com/gig/" + chat.getGigID(), cookie);
        view.loadUrl("https://app.gigster.com/gig/" + chat.getGigID(), headers);
//        view.loadUrl("https://google.com/",headers);

    }

    @OnClick(R.id.backArrow)
    public void back(View v){
        Log.d("WebView", "arrow pressed");
        finish();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
    private class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return false;
        }
    }
}
