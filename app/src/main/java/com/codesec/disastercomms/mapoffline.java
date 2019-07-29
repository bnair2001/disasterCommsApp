package com.codesec.disastercomms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class mapoffline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapoffline);

        WebView browser = (WebView) findViewById(R.id.webView2);
        browser.loadUrl("http://discom-com.stackstaging.com/");
    }
}
