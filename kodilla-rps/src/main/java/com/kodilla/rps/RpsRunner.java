package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    private static boolean playAgain(Scanner scanner){
        System.out.println("Want paly a game (Y) or  (N) ?");
        switch (scanner.next()){
            case "n":
                if(areYouSure(scanner)) {
                    System.out.println("Rock, Paper, Scissors!");
                    return true;
                } else {
                    return false ;
                }
            case "N" :
                if(areYouSure(scanner)) {
                    return false;
                } else {
                    return true ;
                }
        }
        return false;
    }

    private static boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n ?");
        switch (scanner.next()){
            case "y" :
                return true;
            case   "n":
                return false;
        }

        return false;
    }
}
