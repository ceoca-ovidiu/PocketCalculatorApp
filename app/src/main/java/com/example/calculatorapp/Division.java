package com.example.calculatorapp;

public class Division {

    private final double firstNumber;
    private final double secondNumber;

    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double divide(){
        return firstNumber / secondNumber;
    }


}
