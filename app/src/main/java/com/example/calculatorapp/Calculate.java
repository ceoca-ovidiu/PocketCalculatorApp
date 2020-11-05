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
    private TextView firstNumberDisplay;
    private TextView secondNumberDisplay;
    private TextView operationDisplay;
    private TextView resultDisplay;
    private String operationString;
    private String firstStringNumber;
    private String secondStringNumber;
    private int firstNumber;
    private int secondNumber;
    private int result;
    DecimalFormat numberFormat = new DecimalFormat("#.0000");

    public Calculate(TextView firstNumberDisplay, TextView secondNumberDisplay, TextView operationDisplay, TextView resultDisplay) {
        this.firstNumberDisplay = firstNumberDisplay;
        this.secondNumberDisplay = secondNumberDisplay;
        this.operationDisplay = operationDisplay;
        this.resultDisplay = resultDisplay;
        intializeParameters();
        makeCalculations();
    }

    private void intializeParameters (){

         firstStringNumber = firstNumberDisplay.getText().toString();
         secondStringNumber = secondNumberDisplay.getText().toString();
         operationString = operationDisplay.getText().toString();

    }

    private void makeCalculations(){

        if(firstStringNumber.isEmpty() || secondStringNumber.isEmpty()){
            Toast.makeText(new MainActivity(), "Please enter a number in both boxes", Toast.LENGTH_SHORT).show();
        }else if (operationString.isEmpty()){
            Toast.makeText(new MainActivity(), "Please enter the operation you want to do", Toast.LENGTH_SHORT).show();
        }else{
            int firstNumber = Integer.parseInt(firstStringNumber);
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
            }
        }
    }
}
