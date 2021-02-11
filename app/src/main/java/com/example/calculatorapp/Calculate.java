package com.example.calculatorapp;

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
    private double result = 0;
    private double inputDoubleValueOne;
    private double inputDoubleValueTwo;

    public Calculate(TextView inputValueOne, TextView inputValueTwo, TextView inputValueSign, TextView resultDisplay) {
        this.inputValueOne = inputValueOne;
        this.inputValueTwo = inputValueTwo;
        this.inputValueSign = inputValueSign;
        this.resultDisplay = resultDisplay;
        intializeStringParameters();
        convertStringToDouble();
        makeCalculations();
        display();
    }

    private void display() {
        resultDisplay.setText(numberFormat.format(result));
    }

    private void intializeStringParameters() {
        inputStringValueOne = inputValueOne.getText().toString();
        inputStringValueTwo = inputValueTwo.getText().toString();
        inputStringValueSign = inputValueSign.getText().toString();
    }

    private void convertStringToDouble(){

        try {
            inputDoubleValueOne = Double.parseDouble(inputStringValueOne);
        }catch (Exception e){
            inputDoubleValueOne = 3.1415;
        }

        try {
            inputDoubleValueTwo = Double.parseDouble(inputStringValueTwo);
        }catch (Exception e){
            inputDoubleValueTwo = 3.1415;
        }

    }

    private void makeCalculations() {
        if (inputStringValueSign.equals(Character.toString('*'))) {
            Multiplication multiplication = new Multiplication(inputDoubleValueOne,inputDoubleValueTwo);
            result = multiplication.multiply();
        }
        if (inputStringValueSign.equals(Character.toString('+'))) {
            Addition addition = new Addition(inputDoubleValueOne,inputDoubleValueTwo);
            result = addition.add();
        }
        if (inputStringValueSign.equals(Character.toString('-'))) {
            Substraction substraction = new Substraction(inputDoubleValueOne,inputDoubleValueTwo);
            result = substraction.substract();
        }
        if (inputStringValueSign.equals(Character.toString('/'))) {
            Division division = new Division(inputDoubleValueOne,inputDoubleValueTwo);
            result = division.divide();
        }
        if (inputStringValueSign.equals(Character.toString('%'))) {
            Modulo modulo = new Modulo(inputDoubleValueOne,inputDoubleValueTwo);
            result = modulo.modul();
        }
    }
}