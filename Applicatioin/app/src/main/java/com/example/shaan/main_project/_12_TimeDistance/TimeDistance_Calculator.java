package com.example.shaan.main_project._12_TimeDistance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaan.main_project.R;

public class TimeDistance_Calculator extends AppCompatActivity {
    Button button1;
    TextView textView1;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_distance_calculator);
        editText1 = (EditText)findViewById(R.id.TD_editText1);
        editText2 = (EditText)findViewById(R.id.TD_editText2);
        button1= (Button)findViewById(R.id.TD_button1);
        textView1 = (TextView)findViewById(R.id.TD_textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double distance = Double.parseDouble(editText1.getText().toString());
                double time = Double.parseDouble(editText2.getText().toString());
                Double speed = distance/time;
                textView1.setText("Speed : " +speed+" km/h");
            }
        });
    }
}
