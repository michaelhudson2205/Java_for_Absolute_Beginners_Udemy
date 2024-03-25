package sec10_wrap_up;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge6 {

    public static void main(String[] args) {

        // Exercise 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the maximum possible score for this exam: ");
//        int maxScore = scanner.nextInt();
//
//        System.out.print("How many students took the exam: ");
//        int numStudents = scanner.nextInt();
//
//        int[] scores = new int[numStudents];
//
//        System.out.println("\nEnter each student's score.");
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("Student " + (i + 1) + ": ");
//            scores[i] = scanner.nextInt();
//        }
//
//        System.out.println("\n--- Statistics ---");
//
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            double studentScore = scores[i];
//            double studentPercentage = ((double) scores[i] / maxScore) * 100;
//            System.out.println("Student " + (i + 1) + ": " + studentScore + "/"
//                    + maxScore + " (" + studentPercentage + "%)");
//            sum += studentScore;
//        }
//
//        double mean = (double)sum / scores.length;
//        double meanPercentage = (mean / maxScore) * 100;
//        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");

        // Exercise 2
//        String[] questions = new String[] {
//                "The moon is further away from the earth than the sun is",
//                "Goldfish only have a three second memory",
//                "Microwaves have a longer wavelength than ultraviolet",
//                "Antibiotics are used to treat viral infections",
//                "Octopuses have three hearts"
//        };
//
//        boolean[] answers = new boolean[] {
//                false,
//                false,
//                true,
//                false,
//                true
//        };
//
//        boolean[] userAnswers = new boolean[5];
//
//        int finalScore = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i] + ". True of False?");
//            System.out.print("Your answer: ");
//            userAnswers[i] = scanner.nextBoolean();
//
//            if (userAnswers[i] == answers[i]) {
//                System.out.println("Correct!");
//                finalScore++;
//            }
//            else {
//                System.out.println("Wrong. It's " + answers[i] + ".");
//            }
//        }
//
//        System.out.println("\nYour final score is " + finalScore + " out of 5.");


        // Exercise 3
//        System.out.println("\n### Guess My Number Game ###\n");
//
//        System.out.println("--- Rules ---");
//        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
//        System.out.println("Enter \"higher\" if my guess is too low.");
//        System.out.println("Enter \"lower\" if my guess is too high.");
//        System.out.println("Enter \"correct\" if I get it right.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        String input;
//
//        int min = 1;
//        int max = 100;
//
//        while (true) {
//            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
//            System.out.println("\nI guess " + randomNumber + ".");
//            System.out.print("Your response: ");
//            input = scanner.next();
//
//            if (input.equals("higher")) {
//                min = randomNumber + 1;
//            } else if (input.equals("lower")) {
//                max = randomNumber - 1;
//            } else if (input.equals("correct")) {
//                System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
//                break;
//            }
//            if (min == max + 1) {
//                System.out.println("\nThat's not possible. Let's try again.");
//                min = 1;
//                max = 100;
//            }
//        }


        // Exercise 4
        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        while (true) {
            System.out.println("\nI guess " + guess + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            }else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", easy peasy!");
                break;
            }

            guess = (min + max) / 2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}
