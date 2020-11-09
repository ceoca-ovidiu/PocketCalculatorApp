package com.example.calculatorapp;

import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Calculate {

    DecimalFormat numberFormat = new DecimalFormat("#.0000");
    private TextView resultDisplay;
    private TextView inputValue;
    private String inputStringValue;
    private List<String> inputStringList = new ArrayList<>();
    private List<Integer> inputIntegersList = new ArrayList<>();
    private List<Character> inputCharOperations = new ArrayList<>();
    private int result;

    public Calculate(TextView inputValue, TextView resultDisplay) {
        this.inputValue = inputValue;
        this.resultDisplay = resultDisplay;
        intializeStringParameters();
        verifyStingEmptiness();
        inputToLists();
        makeCalculations();
        display();
    }

    private void display() {

        resultDisplay.setText(String.valueOf(result));

    }

    private void inputToLists() {
        for (int i = 0; i < inputStringValue.length(); i++) {
            if (inputStringValue.charAt(i) == '*' ||
                    inputStringValue.charAt(i) == '/' ||
                    inputStringValue.charAt(i) == '+' ||
                    inputStringValue.charAt(i) == '-' ||
                    inputStringValue.charAt(i) == '%') {

                inputCharOperations.add(inputStringValue.charAt(i));

            } else {
                inputIntegersList.add(Integer.parseInt(String.valueOf(inputStringValue.charAt(i))));
            }
        }
    }

    private void intializeStringParameters() {

        inputStringValue = inputValue.getText().toString();

    }

    private void verifyStingEmptiness() {

        if (inputStringValue.isEmpty()) {
            resultDisplay.setText("Empty field");
        }

    }

    private void makeCalculations() {

        result = 0 ;

        while(inputCharOperations.contains('*')){

            int index = inputCharOperations.indexOf('*');
            result = result + inputIntegersList.get(index) * inputIntegersList.get(index + 1);
            inputIntegersList.remove(index + 1);
            inputIntegersList.remove(index);
            inputCharOperations.remove(index);

        }

        result = result + inputIntegersList.get(0);
        inputIntegersList.remove(0);

        if(inputIntegersList.isEmpty()){
            return;
        }else{
            for (Character character : inputCharOperations) {

                if (character == '+') {
                    Addition addition = new Addition(result, inputIntegersList.get(0));
                    result = addition.add();
                    inputIntegersList.remove(0);
                }
                if (character == '-') {
                    Substraction substraction = new Substraction(result, inputIntegersList.get(0));
                    result = substraction.substract();
                    inputIntegersList.remove(0);
                }
                if (character == '*') {
                    Multiplication multiplication = new Multiplication(result, inputIntegersList.get(0));
                    result = multiplication.multiply();
                    inputIntegersList.remove(0);
                }
                if (character == '/') {
                    Division division = new Division(result, inputIntegersList.get(0));
                    result = division.divide();
                    inputIntegersList.remove(0);
                }
                if (character == '%') {
                    Modulo modulo = new Modulo(result, inputIntegersList.get(0));
                    result = modulo.modul();
                    inputIntegersList.remove(0);
                }
            }
        }


    }
}


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