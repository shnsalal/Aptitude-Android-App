package com.example.shaan.main_project._1_NumberSystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaan.main_project.R;

public class EvenOddFinder extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd_finder);

        editText = (EditText)findViewById(R.id.even_editText1);
        button = (Button)findViewById(R.id.even_button1);
        textView = (TextView)findViewById(R.id.even_textView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString());
                number = number % 2;
                if(number == 0){
                    textView.setText(editText.getText()+" is a even number");
                }
                else{
                    textView.setText(editText.getText()+" is a odd number");
                }
            }
        });

    }
}
