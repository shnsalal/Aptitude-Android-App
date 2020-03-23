package com.example.shaan.main_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity1_SplashScreen extends AppCompatActivity {
     android.widget.LinearLayout l1, l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1__splash_screen);
        l1 = (LinearLayout) findViewById(R.id.linearlayout1);
        l2 = (LinearLayout) findViewById(R.id.linearlayout2);
        TextView textView1 = (TextView)findViewById(R.id.splashTextView1);
        TextView textView2 = (TextView)findViewById(R.id.splashTextView2);
        textView1.setText("@ptitude");
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams_BoldItalic.ttf");
        textView1.setTypeface(font);
        textView2.setTypeface(font);

        Animation myanimation1 = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        l1.startAnimation(myanimation1);
        Animation myanimation2 = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l2.startAnimation(myanimation2);
        final Intent intent = new Intent(this,Activity3_Concept.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();

    }
}

