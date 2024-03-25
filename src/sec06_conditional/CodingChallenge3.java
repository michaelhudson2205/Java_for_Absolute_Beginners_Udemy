package sec06_conditional;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge3 {
    public static void main(String[] args) {
//        int x = 9;
//        int y = 16;
//
//        if (x > y) {
//            System.out.println("x is bigger than y");
//        }
//        else if (x < y) {
//            System.out.println("x is smaller than y");
//        }
//        else {
//            System.out.println("x and y are the same");
//        }

//        int x = 91;
//        int y = 75;
//
//        if (x > y) {
//            System.out.println("x is bigger than y by " + (x - y));
//        }
//        else if (x < y) {
//            System.out.println("x is smaller than y by " + (y - x));
//        }
//        else {
//            System.out.println("x and y are the same");
//        }

//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
//
//        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
//        System.out.print("Your guess: ");
//        Scanner scanner = new Scanner(System.in);
//        int guess = scanner.nextInt();
//
//        if (guess == randomNumber) {
//            System.out.println("Correct! Aren't you lucky.");
//        }
//        else {
//            System.out.println("Hard luck! Maybe next time.");
//        }

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
        System.out.print("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! First go, well done.");
        }
        else {
            System.out.println("Wrong! Have another go,");
            System.out.print("Your second guess: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct on your second try.");
            }
            else {
                System.out.println("Wrong again!");
            }
        }
    }
}
