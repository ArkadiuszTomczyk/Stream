package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void exexuteExpression(double a,double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a,b);
        System.out.println("Result equals" + result);
    }
}
