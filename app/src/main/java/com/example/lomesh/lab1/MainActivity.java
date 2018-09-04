package com.example.lomesh.lab1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div,clear;
    EditText number1, number2;

    TextView answer;
    double num1,num2,temp;

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
        clear = (Button)findViewById(R.id.clear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());

                temp = num1 + num2;
                answer.setText(String.valueOf(temp));

                Snackbar snackbar = Snackbar.make(view, "Addition is "+temp, Snackbar.	LENGTH_SHORT).setActionTextColor(Color.BLUE);

                snackbar.show();




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

                Snackbar snackbar = Snackbar.make(view, "Subtraction is "+temp, Snackbar.LENGTH_SHORT);
                snackbar.show();

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

                Snackbar snackbar = Snackbar.make(view, "Multiply is "+temp, Snackbar.LENGTH_SHORT);
                snackbar.show();
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

                Snackbar snackbar = Snackbar.make(view,"Division is "+temp, Snackbar.LENGTH_SHORT);
                snackbar.show();
                }
                }
        );
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                number2.getText().clear();
                number1.getText().clear();
                answer.setText("0");
                }
                }
        );
    }
}
