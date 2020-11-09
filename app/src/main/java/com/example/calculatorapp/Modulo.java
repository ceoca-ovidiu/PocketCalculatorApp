package com.example.calculatorapp;

public class Modulo {

    private int firstNumber;
    private int secondNumber;

    public Modulo(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int modul(){
        return firstNumber % secondNumber;
    }

}
