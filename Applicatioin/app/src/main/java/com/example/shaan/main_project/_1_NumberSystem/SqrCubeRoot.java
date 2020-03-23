package com.example.shaan.main_project._1_NumberSystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaan.main_project.R;

public class SqrCubeRoot extends AppCompatActivity {
    Button button1,button2;
    TextView textView1;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqr_cube_root);
        editText1 = (EditText)findViewById(R.id.root_edittext);
        button1= (Button)findViewById(R.id.root_button1);
        button2= (Button)findViewById(R.id.root_button2);
        textView1 = (TextView)findViewById(R.id.root_textview);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double squareRoot = Double.parseDouble(editText1.getText().toString());
                Double ans = Math.pow(squareRoot,2);
                textView1.setText("Square Root : " + ans);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double squareRoot = Double.parseDouble(editText1.getText().toString());
                Double ans = Math.pow(squareRoot,3);
                textView1.setText("Cube Root : " + ans);
            }
        });
    }
}
