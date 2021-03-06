package com.example.shaan.main_project._1_NumberSystem;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.shaan.main_project.R;

public class Topic4_PrimeAndCompositeNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic4__prime_and_composite_numbers);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/NumberSystem/primeAndCompositeNumbers.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
    }
}
