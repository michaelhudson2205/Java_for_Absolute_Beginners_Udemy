package sec06_conditional;

import java.util.Scanner;
public class vid024_if_etc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

        if (height < 130 || height > 210) {
            System.out.println("Sorry, you do not meet the height requirements.");
        }
//        else if (height > 210) {
//            System.out.println("Sorry, you are too tall.");
//        }
        else {
            System.out.println("Height accepted. Go ahead.");
        }

    }
}
