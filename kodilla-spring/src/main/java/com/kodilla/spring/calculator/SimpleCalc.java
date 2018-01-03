package com.kodilla.spring.calculator;

import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args)
    {
        int first;
        int second;
        char mark;
        Scanner wej = new Scanner(System.in);
        System.out.println("Add first number:");
        first = wej.nextInt();
        System.out.println("Add second number:");
        second = wej.nextInt();

        System.out.println("addition - type +");
        System.out.println("subtraction - type -");
        System.out.println("multiplication  - type *");
        System.out.println("division - type /");
        System.out.println("modulo - type %");

        mark = wej.next().charAt(0);
        switch(mark)
        {
            case '+':
            {
                System.out.println(first + second);
                break;
            }
            case '-':
            {
                System.out.println(first - second);
                break;
            }
            case '*':
            {
                System.out.println(first * second);
                break;
            }
            case '/':
            {
                if(second !=0)
                {
                    System.out.println(first / second + " and rest: " +
                            first % second);
                }
                else
                {
                    System.out.println("we do not divide by zero");
                }
                break;
            }
            case '%':
            {
                if(second !=0)
                {
                    System.out.println(first % second);
                }
                else
                {
                    System.out.println("we do not divide by zero");
                }
            }
        }
    }
}

