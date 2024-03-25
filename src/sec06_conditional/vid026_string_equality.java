package sec06_conditional;

import java.util.Scanner;

public class vid026_string_equality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a VIP Pass? yes/no: ");
        String vipPassReply = scanner.next();

        if (age >= 70 || (age >= 18 && vipPassReply.equals("yes"))) {
            System.out.println("Thanks, go on in.");
        }
        else {
            System.out.println("Sorry, no can do.");
        }
    }
}
