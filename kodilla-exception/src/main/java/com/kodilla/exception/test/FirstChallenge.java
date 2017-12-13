package com.kodilla.exception.test;

public class FirstChallenge extends Throwable {
    public double divide(double a, double b) throws ArithmeticException {
        if (b==0) {
            throw  new ArithmeticException("Cannot divide by 0");
        }
        return a/b;
        }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result;

        try { result = firstChallenge.divide(1, 0);
            System.out.println(result);

        } catch (ArithmeticException e){

            System.out.println( e);

        } finally  {
            System.out.println("Rambo will be back");
        }
    }
}
