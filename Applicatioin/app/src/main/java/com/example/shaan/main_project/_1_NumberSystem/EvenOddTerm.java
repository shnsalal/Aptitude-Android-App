package com.example.shaan.main_project._1_NumberSystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaan.main_project.R;

public class EvenOddTerm extends AppCompatActivity {
    Button button1,button2;
    TextView textView1,textView2;
    EditText editText11,editText12,editText21,editText22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd_term);
        editText11 = (EditText)findViewById(R.id.even_editText11);
        editText12 = (EditText)findViewById(R.id.even_editText12);
        button1 = (Button)findViewById(R.id.even_button1);
        textView1 = (TextView)findViewById(R.id.even_textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(editText11.getText().toString());
                int number2 = Integer.parseInt(editText12.getText().toString());
                int sum1 = (number2-number1)/2;
                int sum2 = sum1+1;
                textView1.setText("Total number of terms between "+number1+" and "+number2+" is : "+sum2);

            }
        });
      /*  button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(editText21.getText().toString());
                int number2 = Integer.parseInt(editText22.getText().toString());
                int sum1 = (number2-number1)/2;
                int sum2 = sum1+1;
                textView2.setText("Total number of terms between "+ number1 +" and "+ number2 +" is "+ sum2);

            }
        });*/
    }
}
