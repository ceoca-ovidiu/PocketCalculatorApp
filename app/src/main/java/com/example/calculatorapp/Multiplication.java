package com.example.calculatorapp;

public class Multiplication {

    private double firstNumber;
    private double secondNumber;

    public Multiplication(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

}
