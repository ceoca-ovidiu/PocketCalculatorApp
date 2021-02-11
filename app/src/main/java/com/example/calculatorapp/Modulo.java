package com.example.calculatorapp;

public class Modulo {

    private final double firstNumber;
    private final double secondNumber;

    public Modulo(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double modul(){
        return firstNumber % secondNumber;
    }

}
