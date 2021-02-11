package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    DecimalFormat numberFormat = new DecimalFormat("#.000");
    private TextView inputValueOne;
    private TextView inputValueTwo;
    private TextView inputValueOperation;
    private TextView resultDisplay;
    private String auxDisplayString;
    private int result;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputValueOne = findViewById(R.id.inputOneTextView);
        inputValueTwo = findViewById(R.id.inputTwoTextView);
        inputValueOperation = findViewById(R.id.signTextView);
        resultDisplay = findViewById(R.id.resultTextView);
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
        inputValueOne.setInputType(InputType.TYPE_NULL); // hide soft keyboard
        inputValueTwo.setInputType(InputType.TYPE_NULL); // hide soft keyboard
        inputValueOperation.setInputType(InputType.TYPE_NULL); // hide soft keyboard
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("*");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("-");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("/");
            }
        });
        moduloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("%");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("+");
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
                if (inputValueOne.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insert first value", Toast.LENGTH_SHORT).show();
                } else if (inputValueTwo.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insert second value", Toast.LENGTH_SHORT).show();
                } else if (inputValueOperation.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insert operation", Toast.LENGTH_SHORT).show();
                } else {
                    Calculate calculate = new Calculate(inputValueOne, inputValueTwo, inputValueOperation, resultDisplay);
                }
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputValueOne.setText("");
                inputValueTwo.setText("");
                inputValueOperation.setText("");
                resultDisplay.setText("");
                auxDisplayString = null;
            }
        });

        radicalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String inputStringValueOne = inputValueOne.getText().toString();
                if (inputStringValueOne.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter a number in the first box", Toast.LENGTH_SHORT).show();
                } else {
                    int firstNumber = Integer.parseInt(inputStringValueOne);

                    if (firstNumber < 0) {
                        Toast.makeText(getApplicationContext(), "Cannot extract square root from negative numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        resultDisplay.setText(numberFormat.format(Math.sqrt(firstNumber)));
                    }
                }

            }
        });
    }

    void display(String stringDisplay) {

        if (stringDisplay == "*" || stringDisplay == "+" || stringDisplay == "-" || stringDisplay == "/" || stringDisplay == "%") {
            inputValueOperation.setText(stringDisplay);
        } else if (inputValueOne.getText().toString().isEmpty()) {
            inputValueOne.setText(stringDisplay);
        } else {
            inputValueTwo.setText(stringDisplay);
        }

    }
}