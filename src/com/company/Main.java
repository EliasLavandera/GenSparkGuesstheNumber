package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int min = 1;
        int max = 20;
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int numTries = 1;
        String Lazy = "Take a guess.";
        String endGame = "y";
        String startGame = "y";

        System.out.println("Hello! What is your name? ");
        String UserName = userInput.nextLine();
        System.out.println("Well, " + UserName + ", I am thinking of a number between 1 and 20.");
        System.out.println(Lazy);
        if (endGame == startGame) {
            while (numTries <= 6) {
                int guess = Integer.valueOf(userInput.nextLine());
                if (guess > randomInt) {
                    System.out.println("Your guess is too high.");
                    System.out.println(Lazy);
                    numTries++;
                } else if (guess < randomInt) {
                    System.out.println("Your guess is too low.");
                    System.out.println(Lazy);
                    numTries++;
                } else {
                    System.out.println("Good job, " + UserName + "! You guessed my number in " + numTries + " guesses! " + randomInt);
                    break;
                }

            }
            if (numTries > 6) {
                System.out.println("Too many tries, the correct answer was: " + randomInt);
            }



            System.out.println("Would you like to play again? (y or n)");
            String endgameOption = userInput.nextLine();
            endGame = endgameOption.replace(endGame, endgameOption);
        }

    }
}
