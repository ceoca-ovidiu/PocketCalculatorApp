package com.example.calculatorapp;

public class Substraction {

    private double firstNumber;
    private double secondNumber;

    public Substraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double substract(){
        return firstNumber - secondNumber;
    }

}
