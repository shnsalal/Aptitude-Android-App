package com.example.shaan.main_project._7_RatioAndPropotion;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.shaan.main_project.R;

public class RatioAndPropotion_Explanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_and_propotion__explanation);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/RatioAndPropotion/ratioAndPropotion.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
    }
}
