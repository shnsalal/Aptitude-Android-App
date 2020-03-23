package com.example.shaan.main_project._1_NumberSystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.shaan.main_project.R;

public class NumberSystemCalculator extends AppCompatActivity {
    CardView CardView1,CardView2,CardView3,CardView4,CardView5,CardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_calculator);
        CardView expand = (CardView) findViewById(R.id.card1);
        expand.setOnClickListener(navigateTo(EvenOddFinder.class));

        CardView multiSelect = (CardView) findViewById(R.id.card2);
        multiSelect.setOnClickListener(navigateTo(EvenOddTerm.class));

        CardView singleSelect = (CardView) findViewById(R.id.card3);
        singleSelect.setOnClickListener(navigateTo(SqrCubeRoot.class));
    }

    public View.OnClickListener navigateTo(final Class<?> clazz) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NumberSystemCalculator.this, clazz);
                startActivity(intent);
            }
        };
    }
}
