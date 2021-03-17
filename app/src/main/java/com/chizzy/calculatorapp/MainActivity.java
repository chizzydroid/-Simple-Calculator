package com.chizzy.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText input1;
    EditText input2;
    Button plus;
    Button times;
    Button  minus;
    Button  divide;
    Button clear;
    TextView answer;
    Button plus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText)  findViewById(R.id.input2);
        plus = (Button) findViewById(R.id .plus);
        plus2 = (Button) findViewById(R.id .plus2);
        times = (Button) findViewById(R.id.times);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.clear);
        answer = (TextView)  findViewById(R.id.answer);

        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input1.getText().length()>0 && input2.getText().length()>0) {

                    Double inp1 = Double.parseDouble(input1.getText().toString());
                    Double inp2 = Double.parseDouble(input2.getText().toString());

                    Double result;
                    result = inp1 + inp2;
                    answer.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this,"please enter a number, space is empty",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
          });

        plus2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input1.getText().length()>0 && input2.getText().length()>0) {

                    Double inp1 = Double.parseDouble(input1.getText().toString());
                    Double inp2 = Double.parseDouble(input2.getText().toString());

                    Double result;
                    result = inp1 % inp2;
                    answer.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this,"please enter a number, space is empty",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });

           times.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input1.getText().length()>0 && input2.getText().length()>0) {

                    Double inp1 = Double.parseDouble(input1.getText().toString());
                    Double inp2 = Double.parseDouble(input2.getText().toString());

                    Double result;
                    result = inp1 * inp2;
                    answer.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this,"please enter a number, space is empty",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });
           minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input1.getText().length()>0 && input2.getText().length()>0) {

                    Double inp1 = Double.parseDouble(input1.getText().toString());
                    Double inp2 = Double.parseDouble(input2.getText().toString());

                    Double result;
                    result = inp1 - inp2;
                    answer.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this,"please enter a number, space is empty",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });

           divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input1.getText().length()>0 && input2.getText().length()>0) {

                    Double inp1 = Double.parseDouble(input1.getText().toString());
                    Double inp2 = Double.parseDouble(input2.getText().toString());

                    Double result;
                    result = inp1 / inp2;
                    answer.setText(Double.toString(result));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this,"please enter a number, space is empty",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });

           clear.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   input1.setText("");
                   input2.setText("");
                   answer.setText("0.00");
                   input1.requestFocus();
               }
           });

           plus.setOnTouchListener(new View.OnTouchListener() {

               @Override
               public boolean onTouch(View v, MotionEvent event) {

                   v.onTouchEvent(event);
                   InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                   if (imm != null){
                       imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                   }
                   return true;
               }
           });

        plus2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                return true;
            }
        });



      minus.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                return true;
            }
        });

        divide.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                return true;
            }
        });


        times.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                v.onTouchEvent(event);
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null){
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                return true;
            }
        });





    }

}