package org.example;

import java.util.Scanner;

public class GuessNumber {
    public void guessnumber() {
        Scanner scan = new Scanner(System.in);
        int RandomNumber = (int) (1 + (100 * Math.random()));

        int guess;
        do {
            System.out.println("Enter a random number between 1-500:");
            guess = scan.nextInt();

            if (RandomNumber == guess) {
                System.out.println(guess + " is the correct number.");

            } else if (RandomNumber > guess) {
                System.out.println("is to low guess a bigger number.");
            } else if (RandomNumber < guess) {
                System.out.println("is to big guess a smaller number.");
                System.out.println("You had " + "tries");
            }
        }
        while (guess != RandomNumber);
    }
}
