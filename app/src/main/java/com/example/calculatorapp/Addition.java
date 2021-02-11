package com.example.calculatorapp;

public class Addition {

    private double firstNumber;
    private double secondNumber;

    public Addition(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add(){
        return firstNumber + secondNumber;
    }
}
