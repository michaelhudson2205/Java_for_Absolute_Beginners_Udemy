package sec07_loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge4 {
    public static void main(String[] args) {
        // Exercise 1
//        for (int i = 89; i <= 117; i++) {
//            System.out.println(i);
//        }

        // Exercice 2
//        int count = 1;
//
//        for (int i = 1; i <= 40; i++) {
//            System.out.println(i);
//
//            if (count == 3) {
//                System.out.println("Quack.");
//                count = 0;
//            }
//
//            count++;
//        }

        // Exercise 3
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        do {
//            System.out.print("Enter Password: ");
//            input = scanner.next();
//        } while (!input.equals("shark50"));
//
//        System.out.println("ACCESS APPROVED");

        // Exercise 4
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("\b\b.");

        // Exercise 5
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
//        int guess;
//
//        System.out.println("--- Guess My NUmber Game ---");
//
//        do {
//            System.out.print("\nGuess: ");
//            guess = scanner.nextInt();
//
//            if (guess < randomNumber) {
//                System.out.println("Go HIGHER.");
//            }
//            else if (guess > randomNumber) {
//                System.out.println("Go LOWER.");
//            }
//            else {
//                System.out.println("CORRECT. My number was " + randomNumber + ".");
//            }
//        } while (guess != randomNumber);

        // Exercise 6
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        System.out.println("--- Guess My NUmber Game ---");

        do {
            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("Go HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("Go LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " guesses!");
            }
        } while (guess != randomNumber);
    }
}
