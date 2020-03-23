package com.example.shaan.main_project._21_RacesAndGamesOfSkill;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.shaan.main_project.R;

public class RacesAndGamesOfSkill_Explanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_races_and_games_of_skill__explanation);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/RacesAndGamesOfSkill/racesAndGamesOfSkill.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
    }
}
