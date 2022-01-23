package com.kodilla.testing.calculator;

public class Calculator {

    int a, b;

    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(int a, int b) {
        return a - b;
    }



    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(5, 6);
        int result2 = calculator.substractAFromB(6, 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}


