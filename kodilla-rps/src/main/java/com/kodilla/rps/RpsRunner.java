package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    private boolean playAgain(Scanner scanner){
        System.out.println("Want paly a game (Y) or  (N) ?");
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
