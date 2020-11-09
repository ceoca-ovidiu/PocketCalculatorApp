package com.example.calculatorapp;

public class Multiplication {

    private int firstNumber;
    private int secondNumber;

    public Multiplication(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int multiply(){
        return firstNumber * secondNumber;
    }

}
