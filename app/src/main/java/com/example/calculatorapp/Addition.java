package com.example.calculatorapp;

public class Addition {

    private final double firstNumber;
    private final double secondNumber;

    public Addition(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add(){
        return firstNumber + secondNumber;
    }
}
