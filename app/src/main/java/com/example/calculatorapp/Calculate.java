package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculate {

    private final TextView resultDisplay;
    private final TextView inputValueOne;
    private final TextView inputValueTwo;
    private final TextView inputValueSign;
    DecimalFormat numberFormat = new DecimalFormat("#.000");
    private String inputStringValueOne;
    private String inputStringValueTwo;
    private String inputStringValueSign;
    private int result = 0;

    public Calculate(TextView inputValueOne, TextView inputValueTwo, TextView inputValueSign, TextView resultDisplay) {
        this.inputValueOne = inputValueOne;
        this.inputValueTwo = inputValueTwo;
        this.inputValueSign = inputValueSign;
        this.resultDisplay = resultDisplay;
        intializeStringParameters();
        makeCalculations();
        display();
    }

    private void display() {
        resultDisplay.setText(String.valueOf(numberFormat.format(result)));
    }

    private void intializeStringParameters() {
        inputStringValueOne = inputValueOne.getText().toString();
        inputStringValueTwo = inputValueTwo.getText().toString();
        inputStringValueSign = inputValueSign.getText().toString();
    }

    private void makeCalculations() {
        if (inputStringValueSign.equals(Character.toString('*'))) {
            Multiplication multiplication = new Multiplication(Integer.parseInt(inputStringValueOne), Integer.parseInt(inputStringValueTwo));
            result = multiplication.multiply();
        }
        if (inputStringValueSign.equals(Character.toString('+'))) {
            Addition addition = new Addition(Integer.parseInt(inputStringValueOne), Integer.parseInt(inputStringValueTwo));
            result = addition.add();
        }
        if (inputStringValueSign.equals(Character.toString('-'))) {
            Substraction substraction = new Substraction(Integer.parseInt(inputStringValueOne), Integer.parseInt(inputStringValueTwo));
            result = substraction.substract();
        }
        if (inputStringValueSign.equals(Character.toString('/'))) {
            Division division = new Division(Integer.parseInt(inputStringValueOne), Integer.parseInt(inputStringValueTwo));
            result = division.divide();
        }
        if (inputStringValueSign.equals(Character.toString('%'))) {
            Modulo modulo = new Modulo(Integer.parseInt(inputStringValueOne), Integer.parseInt(inputStringValueTwo));
            result = modulo.modul();
        }
    }
}