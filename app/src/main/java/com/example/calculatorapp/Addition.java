package com.example.calculatorapp;

public class Addition {

    private int firstNumber;
    private int secondNumber;

    public Addition(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add(){
        return firstNumber + secondNumber;
    }
}
