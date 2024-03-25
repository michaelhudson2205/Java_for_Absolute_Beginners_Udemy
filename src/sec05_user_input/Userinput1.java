package sec05_user_input;

import java.util.Scanner;

public class Userinput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);
    }
}
