package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView operationtextView = findViewById(R.id.operationTextView);
        final TextView firstNumberPlainText = findViewById(R.id.firstNumberPlainText);
        final TextView secondNumberPlainText = findViewById(R.id.secondNumberPlainText);
        final TextView resulttextView = findViewById(R.id.resultTextView);
        Button zeroButton = findViewById(R.id.zeroButton);
        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        Button moduloButton = findViewById(R.id.moduloButton);
        Button radicalButton = findViewById(R.id.sqrtButton);
        Button piButton = findViewById(R.id.piButton);
        Button dotButton = findViewById(R.id.dotButton);
        Button equalButton = findViewById(R.id.equalButton);
        Button clearButton = findViewById(R.id.clearButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationtextView.setText("*");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberPlainText.setText("");
                secondNumberPlainText.setText("");
                resulttextView.setText("");
                operationtextView.setText("");
            }
        });

        radicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstStringNumber =  firstNumberPlainText.getText().toString();
                int firstNumber = Integer.parseInt(firstStringNumber);

                if(firstNumber < 0){
                    resulttextView.setText("Cannot extract square root from negative numbers");
                }else{
                    resulttextView.setText(String.valueOf(Math.sqrt(firstNumber)));
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationtextView.setText("-");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationtextView.setText("/");
            }
        });
        moduloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationtextView.setText("%");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationtextView.setText("+");
            }
        });
        firstNumberPlainText.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                firstNumberPlainText.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });
        secondNumberPlainText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                secondNumberPlainText.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("0");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("0");
                }
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("1");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("1");
                }

            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("2");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("2");
                }
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("3");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("3");
                }
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("4");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("4");
                }
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("5");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("5");
                }
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("6");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("6");
                }
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("7");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("7");
                }
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("8");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("8");
                }
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumberPlainText.hasFocus()){
                    firstNumberPlainText.setText("9");
                }
                if(secondNumberPlainText.hasFocus()){
                    secondNumberPlainText.setText("9");
                }
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String firstStringNumber =  firstNumberPlainText.getText().toString();
                String secondStringNumber = secondNumberPlainText.getText().toString();
                String operation =  operationtextView.getText().toString();


                int firstNumber = Integer.parseInt(firstStringNumber);
                int secondNumber = Integer.parseInt(secondStringNumber);

                switch (operation){
                    case "*":
                        resulttextView.setText(String.valueOf(firstNumber * secondNumber));
                        break;
                    case "/":
                        if(secondNumber == 0){
                            resulttextView.setText("Cannot divide by 0");
                            secondNumberPlainText.setText("");
                        }else{
                            resulttextView.setText(String.valueOf((float)firstNumber / (float)secondNumber));
                        }
                        break;
                    case "%" :
                        resulttextView.setText(String.valueOf(firstNumber % secondNumber));
                        break;
                    case "-" :
                        resulttextView.setText(String.valueOf(firstNumber - secondNumber));
                        break;
                    case "+" :
                        resulttextView.setText(String.valueOf(firstNumber + secondNumber));
                        break;
                }


            }
        });

    }
}