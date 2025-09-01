// Number Guessing Game - Internship Task

import java.util.*;  

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int playAgain = 1;
        int score = 0;

        System.out.println("Welcome to Number Guessing Game!");

        while (playAgain == 1) {
            int number = r.nextInt(100) + 1;  // number from 1 to 100
            int attempts = 0;
            int limit = 7;
            boolean correct = false;

            System.out.println("\nNew Round! You have " + limit + " tries.");

            while (attempts < limit) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Yay! You guessed it!");
                    score += (limit - attempts + 1);  
                    correct = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!correct) {
                System.out.println("Oops! You failed. Number was: " + number);
            }

            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (1=Yes, 0=No): ");
            playAgain = sc.nextInt();
        }

        System.out.println("Game Over! Final score: " + score);
        sc.close();
    }
}

