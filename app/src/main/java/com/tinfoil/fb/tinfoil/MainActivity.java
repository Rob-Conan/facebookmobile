package com.tinfoil.fb.tinfoil;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        //Create default view for the facebook application
        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://m.facebook.com");
    }

    @Override
    public void onBackPressed(){
        if (myWebView.canGoBack()){
            myWebView.goBack();
            return;
        }
        super.onBackPressed();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

}
