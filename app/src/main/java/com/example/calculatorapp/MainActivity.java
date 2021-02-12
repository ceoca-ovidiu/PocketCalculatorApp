package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
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

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons and textViews identifications

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
        Button eraseButton = findViewById(R.id.eraseButton);


        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Button powerTwoButton = findViewById(R.id.powerTwoButton);
            Button powerThreeButton = findViewById(R.id.powerThreeButton);
            Button powerYButton = findViewById(R.id.powerYButton);
            Button cosButton = findViewById(R.id.cosButton);
            Button sinButton = findViewById(R.id.sinButton);
            powerTwoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputStringValueOne = inputValueOne.getText().toString();
                    if (inputStringValueOne.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please enter a number in the first field", Toast.LENGTH_SHORT).show();
                    } else {
                        double firstNumber = Double.parseDouble(inputStringValueOne);
                        resultDisplay.setText(numberFormat.format(firstNumber * firstNumber));
                    }
                }
            });

            powerThreeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputStringValueOne = inputValueOne.getText().toString();
                    if (inputStringValueOne.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please enter a number in the first field", Toast.LENGTH_SHORT).show();
                    } else {
                        double firstNumber = Double.parseDouble(inputStringValueOne);
                        resultDisplay.setText(numberFormat.format(firstNumber * firstNumber * firstNumber));
                    }
                }
            });

            powerYButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputStringValueOne = inputValueOne.getText().toString();
                    String inputStringValueTwo = inputValueTwo.getText().toString();
                    double result = 1;
                    if (inputStringValueOne.isEmpty() || inputStringValueTwo.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please enter valid numbers in the fields", Toast.LENGTH_SHORT).show();
                    } else {
                        double firstNumber = Double.parseDouble(inputStringValueOne);
                        double secondNumber = Double.parseDouble(inputStringValueTwo);
                        for (int i = 0; i < secondNumber; i++) {
                            result = result * firstNumber;
                        }
                        resultDisplay.setText(numberFormat.format(result));
                    }
                }
            });

            cosButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputStringValueOne = inputValueOne.getText().toString();
                    if (inputStringValueOne.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please enter a number in the first field", Toast.LENGTH_SHORT).show();
                    } else {
                        double firstNumber = Double.parseDouble(inputStringValueOne);
                        resultDisplay.setText(numberFormat.format(Math.cos(firstNumber)));
                    }
                }
            });

            sinButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputStringValueOne = inputValueOne.getText().toString();
                    if (inputStringValueOne.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please enter a number in the first field", Toast.LENGTH_SHORT).show();
                    } else {
                        double firstNumber = Double.parseDouble(inputStringValueOne);
                        resultDisplay.setText(numberFormat.format(Math.sin(firstNumber)));
                    }
                }
            });
        }

        // set focus on start

        setFocus(inputValueOne);

        // Make the text selectable for the first and the second fields

        inputValueOne.setTextIsSelectable(true);
        inputValueTwo.setTextIsSelectable(true);

        // hide the basic keyboard

        inputValueOne.setInputType(InputType.TYPE_NULL);
        inputValueTwo.setInputType(InputType.TYPE_NULL);
        inputValueOperation.setInputType(InputType.TYPE_NULL);

        // OnClick Listeners (0-9)

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

        // OnClick Listeners (Operations)

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOperation("*");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOperation("-");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOperation("/");
            }
        });
        moduloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOperation("%");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOperation("+");
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
                } else if (inputValueOne.getText().toString().equals(".") || inputValueTwo.getText().toString().equals(".")) {
                    Toast.makeText(getApplicationContext(), "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                } else {
                    new Calculate(inputValueOne, inputValueTwo, inputValueOperation, resultDisplay);
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
                setFocus(inputValueOne);
            }
        });
        radicalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String inputStringValueOne = inputValueOne.getText().toString();
                if (inputStringValueOne.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter a number in the first field", Toast.LENGTH_SHORT).show();
                } else {
                    double firstNumber = Double.parseDouble(inputStringValueOne);

                    if (firstNumber < 0) {
                        Toast.makeText(getApplicationContext(), "Cannot extract square root from negative numbers", Toast.LENGTH_SHORT).show();
                    } else {
                        resultDisplay.setText(numberFormat.format(Math.sqrt(firstNumber)));
                    }
                }
            }
        });
        piButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) getCurrentFocus();
                if (textView.getText().toString().isEmpty()) {
                    display("PI");
                } else {
                    Toast.makeText(getApplicationContext(), "Already a number in the field", Toast.LENGTH_SHORT).show();
                }

            }
        });
        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) getCurrentFocus();
                String auxString = textView.getText().toString();
                if (auxString.contains(".")) {
                    Toast.makeText(getApplicationContext(), "Already a point in the field", Toast.LENGTH_SHORT).show();
                } else {
                    display(".");
                }
            }
        });

        eraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) getCurrentFocus();
                if (textView.getText().toString().length() != 0) {
                    textView.setText(textView.getText().toString().subSequence(0, textView.getText().toString().length() - 1));
                } else {
                    Toast.makeText(getApplicationContext(), "Nothing to erase", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @SuppressLint("SetTextI18n")
    private void display(String stringDisplay) {
        TextView view = (TextView) getCurrentFocus();
        view.setText(view.getText() + stringDisplay);
    }

    private void displayOperation(String string) {
        inputValueOperation.setText(string);
        setFocus(inputValueTwo);
    }

    private void setFocus(View view) {
        view.setFocusableInTouchMode(true);
        view.requestFocus();
    }
}