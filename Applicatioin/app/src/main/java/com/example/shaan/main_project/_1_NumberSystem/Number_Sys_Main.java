package com.example.shaan.main_project._1_NumberSystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.shaan.main_project.R;

public class Number_Sys_Main extends AppCompatActivity {
    CardView CardView1,CardView2,CardView3,CardView4,CardView5,CardView6,cardView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_sys_main);
        CardView topic1 = (CardView) findViewById(R.id.card1);
        topic1.setOnClickListener(navigateTo(Topic1_NumberSystem.class));

        CardView topic2 = (CardView) findViewById(R.id.card2);
        topic2.setOnClickListener(navigateTo(Topic2_TypesOfNumbers.class));

        CardView topic3 = (CardView) findViewById(R.id.card3);
        topic3.setOnClickListener(navigateTo(Topic3_EvenAndOddNumbers.class));

        CardView topic4 = (CardView) findViewById(R.id.card4);
        topic4.setOnClickListener(navigateTo(Topic4_PrimeAndCompositeNumbers.class));

        CardView topic5 = (CardView) findViewById(R.id.card5);
        topic5.setOnClickListener(navigateTo(Topic5_TestOfDivisibility.class));

        CardView topic6 = (CardView) findViewById(R.id.card6);
        topic6.setOnClickListener(navigateTo(NumberSystemCalculator.class));

        CardView topic7 = (CardView) findViewById(R.id.card7);
        topic7.setOnClickListener(navigateTo(Practice.class));

    }

    public View.OnClickListener navigateTo(final Class<?> clazz) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Number_Sys_Main.this, clazz);
                startActivity(intent);
            }
        };
    }
}
