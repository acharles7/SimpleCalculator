package com.example.lomesh.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    EditText number1, number2;

    TextView answer;
    Float num1,num2,temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        answer = (TextView)findViewById(R.id.ans);

        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());

                temp = num1 + num2;
                answer.setText(String.valueOf(temp));

            }

        }
        );
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());

                temp = num1 - num2;
                answer.setText(String.valueOf(temp));

                }
        }
        );
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());

                temp = num1 * num2;
                answer.setText(String.valueOf(temp));

                }
                }
        );
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());

                temp = num1 / num2;
                answer.setText(String.valueOf(temp));

                }
                }
        );

    }
}