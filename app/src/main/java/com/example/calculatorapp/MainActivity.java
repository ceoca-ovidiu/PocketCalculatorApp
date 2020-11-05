package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView firstNumberDisplay;
    private TextView secondNumberDisplay;
    private TextView operationDisplay;
    private TextView resultDisplay;
    DecimalFormat numberFormat = new DecimalFormat("#.0000");

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView operationTextView = findViewById(R.id.operationTextView);
        final TextView resultTextView = findViewById(R.id.resultTextView);
        final TextView firstNumberPlainText = findViewById(R.id.firstNumberPlainText);
        final TextView secondNumberPlainText = findViewById(R.id.secondNumberPlainText);
        firstNumberDisplay = firstNumberPlainText;
        secondNumberDisplay = secondNumberPlainText;
        operationDisplay = operationTextView;
        resultDisplay = resultTextView;
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
                setOperationText("*");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperationText("-");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperationText("/");
            }
        });
        moduloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperationText("%");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperationText("+");
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
                display("0");
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("1");
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("2");
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("3");
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("4");
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("5");
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("6");
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("7");
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("8");
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("9");
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                Calculate calculate = new Calculate(firstNumberDisplay, secondNumberDisplay,operationDisplay,resultDisplay);

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberPlainText.setText("");
                secondNumberPlainText.setText("");
                resultTextView.setText("");
                operationTextView.setText("");
            }
        });

        radicalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String firstStringNumber = firstNumberPlainText.getText().toString();
                if(firstStringNumber.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter a number in the first box", Toast.LENGTH_SHORT).show();
                }else{
                    int firstNumber = Integer.parseInt(firstStringNumber);

                    if (firstNumber < 0) {
                        Toast.makeText(getApplicationContext(), "Cannot extract square root from negative numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        resultTextView.setText(numberFormat.format(Math.sqrt(firstNumber)));
                    }
                }

            }
        });
    }

    void display(String stringDisplay) {
        if (firstNumberDisplay.hasFocus()) {
            firstNumberDisplay.setText(stringDisplay);
        }
        if (secondNumberDisplay.hasFocus()) {
            secondNumberDisplay.setText(stringDisplay);
        }
    }

    void setOperationText(String stringStter){
        operationDisplay.setText(stringStter);
    }
}