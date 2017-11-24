package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.exexuteExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.exexuteExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.exexuteExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.exexuteExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.exexuteExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.exexuteExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.exexuteExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.exexuteExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Beautiful decoraton in action");
        poemBeautifier.beautiful(15, 123, (c, d) -> c - d);



    }
}
