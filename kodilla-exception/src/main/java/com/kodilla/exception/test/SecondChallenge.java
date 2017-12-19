package com.kodilla.exception.test;

public class SecondChallenge {
    public double probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling("WRONG ");
        }
        return 5;
    }
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        double result;

        try { result = secondChallenge.probablyIWillThrowException( 2.9, 2.2);
            System.out.println(result);

        } catch (ExceptionHandling exceptionHandling) {
            exceptionHandling.printStackTrace();
        } finally  {
            System.out.println("Perhaps");
        }
    }
}