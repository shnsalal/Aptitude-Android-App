package com.example.shaan.main_project._15_MixtureAndAlligation;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.shaan.main_project.R;

public class MixtureAndAlligation_Explanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixture_and_alligation_explanation);

        setContentView(R.layout.activity_average);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/MixtureAndAlligation/mixtureAndAlligation.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
    }
}
