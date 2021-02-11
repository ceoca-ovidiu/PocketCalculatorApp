package com.example.calculatorapp;

public class Division {

    private double firstNumber;
    private double secondNumber;

    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double divide(){
        return firstNumber / secondNumber;
    }


}
