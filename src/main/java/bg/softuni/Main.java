package bg.softuni;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the guess the number game");
        System.out.println("Enter lower bound:");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter upper bound:");
        int upperBound = scanner.nextInt();
        System.out.println("Okay choose from a number between " + lowerBound + " and " + upperBound);
        int number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int tries = 0;
        boolean hasGuessedCorrectly = false;
        while(!hasGuessedCorrectly) {
            System.out.println("Enter your guess");
            int guess = scanner.nextInt();
            tries ++;
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number in " + tries + " tries!");
                hasGuessedCorrectly = true;
            } else if (guess < number) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        scanner.close();


    }
}