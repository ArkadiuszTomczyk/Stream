package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double x = calc.add(5, 10);
        double y = calc.subtract(12,7);
        System.out.println(x);
        System.out.println(y);
    }
}

