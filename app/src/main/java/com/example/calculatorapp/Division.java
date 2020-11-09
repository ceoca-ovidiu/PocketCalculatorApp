package com.example.calculatorapp;

public class Division {

    private int firstNumber;
    private int secondNumber;

    public Division(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int divide(){
        return firstNumber / secondNumber;
    }


}
