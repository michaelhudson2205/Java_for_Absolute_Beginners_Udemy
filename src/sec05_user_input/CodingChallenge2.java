package sec05_user_input;

import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: $");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + ". Your name is " + firstName.length() + " characters long.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old.");
        System.out.format("You have $%.2f on you and need $%.2f.", money, moneyNeeded);*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bill total: $");
        double bill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format("A bill of $%.2f split between " + people + " people comes to approx. $%.2f each.", bill, eachPay);
    }
}
