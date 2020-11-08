package com.example.calculatorapp;

public class Substraction {

    private int firstNumber;
    private int secondNumber;

    public Substraction(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int substract(){
        return firstNumber - secondNumber;
    }

}
