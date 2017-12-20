package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    public final static String SCISSORS = "SCISSORS";
    public final static String PAPER = "PAPER";
    public final static String ROCK = "ROCK";
    private String humanChoice;
    private String computerChoice;
    private Scanner scanner;

    public RpsGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getHumanChoice() {
        return humanChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void selectHumanChoice() {
        System.out.println("Select: (S)CISSORS, (P)APER, (R)OCK");
        switch (scanner.next()) {
            case "S": humanChoice = SCISSORS;
            break;
            case  "P": humanChoice = PAPER;
            break;
            case "R": humanChoice = ROCK;
            break;
            default:
                System.out.println("Wrong selection!!");
        }
    }
    public void selectComputerChoice() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0: computerChoice = SCISSORS;
            break;
            case  1: computerChoice = PAPER;
            break;
            case  2: computerChoice = ROCK;
            break;
        }
    }
    public boolean calculateWinner() {
        System.out.println("Human Selected: " + humanChoice);
        System.out.println("Computer Selected: " + computerChoice);

        if (humanChoice.equals(SCISSORS)) {
            switch (computerChoice) {
                case SCISSORS:
                    System.out.println("Play again - nobody wins");
                    return false;
                case PAPER:
                    System.out.println("Human wins");
                    return true;
                case ROCK:
                    System.out.println("Computer wins");
                    return false;
            }
        } else if (humanChoice.equals(PAPER)) {
            switch (computerChoice) {
                case SCISSORS:
                    System.out.println("Computer wins");
                    return false;
                case PAPER:
                    System.out.println("Play again - nobody wins");
                    return false;
                case ROCK:
                    System.out.println("Human wins");
                    return true;
            }
        } else if (humanChoice.equals(ROCK)) {
            switch (computerChoice) {
                case SCISSORS:
                    System.out.println("Human wins");
                    return true;
                case PAPER:
                    System.out.println("Computer wins");
                    return false;
                case ROCK:
                    System.out.println("Play again - nobody wins");
                    return false;
            }

        }
        return false;
    }
}
