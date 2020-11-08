package com.example.calculatorapp;

import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Calculate {

    private Substraction substraction;
    private Multiplication multiplication;
    private Division division;
    private Modulo modulo;
    private TextView resultDisplay;
    private TextView inputValue;
    private String inputStringValue;
    private List<String> inputStringList = new ArrayList<>();
    private List<Integer> inputIntegersList = new ArrayList<>();
    private List<Character> inputCharOperations = new ArrayList<>();
    private int firstNumber;
    private int secondNumber;
    private int result;
    DecimalFormat numberFormat = new DecimalFormat("#.0000");

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

        resultDisplay.setText(result);

    }

    private void inputToLists() {
        for(int i =0 ; i < inputStringValue.length() ; i++){
            if(inputStringValue.charAt(i) == '*' ||
                    inputStringValue.charAt(i) == '/' ||
                    inputStringValue.charAt(i) == '+' ||
                    inputStringValue.charAt(i) == '-' ||
                    inputStringValue.charAt(i) == '%'){

                inputCharOperations.add(inputStringValue.charAt(i));

            }else{
                inputIntegersList.add(Integer.parseInt(String.valueOf(inputStringValue.charAt(i))));
            }
        }
    }

    private void intializeStringParameters(){

        inputStringValue = inputValue.getText().toString();

    }

    private void verifyStingEmptiness(){

        if(inputStringValue.isEmpty()){
            Toast.makeText(new MainActivity(), "Please enter something ", Toast.LENGTH_SHORT).show();
        }

    }

    private void makeCalculations(){ // TODO : here it crashes

        result = inputIntegersList.get(0);
        inputIntegersList.remove(0);

        for(Character character : inputCharOperations){

            if(character == '+'){
                Addition addition = new Addition(result,inputIntegersList.get(0));
                result = addition.add();
                inputIntegersList.remove(0);
            }
            if(character == '-'){
                Substraction substraction = new Substraction(result, inputIntegersList.get(0));
                result = substraction.substract();
                inputIntegersList.remove(0);
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