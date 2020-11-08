package com.example.calculatorapp;

import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Calculate {

    private Addition addition;
    private Substraction substraction;
    private Multiplication multiplication;
    private Division division;
    private Modulo modulo;
    private TextView resultDisplay;
    private TextView inputValue;
    private String inputStringValue;
    private int firstNumber;
    private int secondNumber;
    private int result;
    DecimalFormat numberFormat = new DecimalFormat("#.0000");

    public Calculate(TextView inputValue, TextView resultDisplay) {
        this.inputValue = inputValue;
        this.resultDisplay = resultDisplay;
        intializeStringParameters();
        makeCalculations();
    }

    private void intializeStringParameters(){

        inputStringValue = inputValue.getText().toString();

    }

    private void verifyStingEmptiness(){

        if(inputStringValue.isEmpty()){
            Toast.makeText(new MainActivity(), "Please enter something ", Toast.LENGTH_SHORT).show();
        }

    }

    private void makeCalculations(){

            /*int firstNumber = Integer.parseInt(firstStringNumber);
            int secondNumber = Integer.parseInt(secondStringNumber);
            switch (operationString) {
                case "*":
                    resultDisplay.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber == 0) {
                        resultDisplay.setText("Cannot divide by 0");
                        secondNumberDisplay.setText("");
                    } else {
                        resultDisplay.setText(numberFormat.format((float) firstNumber / (float) secondNumber));
                    }
                    break;
                case "%":
                    resultDisplay.setText(String.valueOf(firstNumber % secondNumber));
                    break;
                case "-":
                    resultDisplay.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "+":
                    resultDisplay.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                default :

            }*/
        }
    }

