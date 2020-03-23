package com.example.shaan.main_project._17_CompoundInterest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.shaan.main_project.R;

public class Compound_Main extends AppCompatActivity {
    CardView CardView1,CardView2,CardView3,CardView4,CardView5,CardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound__main);
        CardView topic1 = (CardView) findViewById(R.id.card1);
        topic1.setOnClickListener(navigateTo(Compound_Interest_Explanation.class));

        CardView topic2= (CardView) findViewById(R.id.card2);
        topic2.setOnClickListener(navigateTo(Compound_Interest_Calculator.class));

        CardView topic3= (CardView) findViewById(R.id.card3);
        topic3.setOnClickListener(navigateTo(Practice.class));

    }

    public View.OnClickListener navigateTo(final Class<?> clazz) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compound_Main.this, clazz);
                startActivity(intent);
            }
        };
    }
}
