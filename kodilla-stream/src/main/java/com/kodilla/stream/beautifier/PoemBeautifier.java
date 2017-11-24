package com.kodilla.stream.beautifier;


import com.kodilla.stream.lambda.MathExpression;

public class PoemBeautifier {

    public void beautiful(double c, double d, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(c, d);
        System.out.println("add" + result);
    }

}
