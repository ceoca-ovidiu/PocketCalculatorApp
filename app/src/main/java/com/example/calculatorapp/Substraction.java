package com.example.calculatorapp;

public class Substraction {

    private final double firstNumber;
    private final double secondNumber;

    public Substraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double substract(){
        return firstNumber - secondNumber;
    }

}
