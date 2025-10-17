package com.qa.demo;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}