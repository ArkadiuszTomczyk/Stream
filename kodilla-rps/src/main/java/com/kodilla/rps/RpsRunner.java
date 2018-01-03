package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

//    private boolean typeYourName (Scanner String) {
//        System.out.println("Enter NUMBER OF PLAY ");
//        switch (String.next()) {
//            case java.lang.String.valueOf(typeYourName("name")):
//                System.out.println("Hello");
//                while (typeYourName("Enter NUMBER OF PLAY "))
//                return true;
//            case "":
//                return true;
//        }
//        return true;
//    }




    private boolean playAgain(Scanner scanner){
        System.out.println("Want play a game (Y) or  (N) ?");
        switch (scanner.next()){
            case "Y": case  "y":
                    System.out.println("Rock, Paper, Scissors!");
                    RpsGame theGame = new RpsGame(scanner);
                    theGame.selectHumanChoice();
                    theGame.selectComputerChoice();
                    return theGame.calculateWinner();
            case "N": case "n" :
                if(areYouSure(scanner)) {
                    return false;
                } else {
                    return true ;
                }
        }
        return false;
    }

    private boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n ?");
        switch (scanner.next()){
            case "y" :
                return true;
            case   "n":
                return false;
        }

        return false;
    }
    public static void main (String[] args) {
        RpsRunner rpsRunner = new RpsRunner();
        Scanner scanner = new Scanner(System.in);
        rpsRunner.playAgain(scanner);
    }
}
