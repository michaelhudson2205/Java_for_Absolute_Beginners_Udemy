package sec08_arrays;

import java.util.Scanner;

public class CodingChallenge5 {

    public static void main(String[] args) {

        // Exercise 1
//        int[] intArr = new int[10];
//        intArr[0] = 45;
//        intArr[1] = 865;
//        intArr[2] = 23;
//        intArr[3] = 6;
//        intArr[4] = 368;
//        intArr[5] = 9032;
//        intArr[6] = 557;
//        intArr[7] = 226;
//        intArr[8] = 834564;
//        intArr[9] = 34001;
//
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println("intArr[" + i + "] = " + intArr[i]);
//        }
//
//        System.out.println();
//
//        int[] mikeArr = new int[] {79, 84, 85};
//        for (int sardine = 0; sardine < mikeArr.length; sardine++) {
//            System.out.println("mikeArr[" + sardine + "] = " + mikeArr[sardine]);
//        }

        // Exercise 2
//        int[] intArr = new int[20];
//
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = i + 1;
//        }
//
//        for (int i = intArr.length - 1; i >= 0; i--) {
//            System.out.println(intArr[i]);
//        }

        // Exercise 3
//        double[] intArr = new double[5];
//        intArr[0] = 12.397;
//        intArr[1] = 5346.3;
//        intArr[2] = 90;
//        intArr[3] = 6.58;
//        intArr[4] = 368.11;
//
//        double sum = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            sum += intArr[i];
//        }
//
//        double mean = sum / intArr.length;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Mean: " + mean);

        // Exercise 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }
    }
}
