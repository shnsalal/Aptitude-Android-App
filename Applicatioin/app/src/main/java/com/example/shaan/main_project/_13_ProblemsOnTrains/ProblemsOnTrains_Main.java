package com.example.shaan.main_project._13_ProblemsOnTrains;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.shaan.main_project.R;

public class ProblemsOnTrains_Main extends AppCompatActivity {
    CardView CardView1,CardView2,CardView3,CardView4,CardView5,CardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems_on_trains__main);

        CardView topic1 = (CardView) findViewById(R.id.card1);
        topic1.setOnClickListener(navigateTo(ProblemsOnTrains_Explanation.class));

        CardView topic2= (CardView) findViewById(R.id.card2);
        topic2.setOnClickListener(navigateTo(Practice.class));


    }

    public View.OnClickListener navigateTo(final Class<?> clazz) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProblemsOnTrains_Main.this, clazz);
                startActivity(intent);
            }
        };
    }
}
