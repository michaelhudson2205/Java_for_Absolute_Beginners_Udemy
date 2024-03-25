package sec08_arrays;

import java.util.Scanner;

public class vid040_sizes {
    public static void main(String[] args) {

//        double[] foo = {0.6, 22.81, 87.555};
//        double[] bar = new double[3];
//        System.out.println(bar[1]);
//        bar[0] = 39.03;
//        bar[1] = 94.5;
//        bar[2] = 13.927;
//        System.out.println(bar[1]);
//        boolean[] aaa = {true, false, false, true, false};
//        boolean[] bbb = new boolean[5];
//        System.out.println(bbb[2]);

        Scanner scanner = new Scanner(System.in);

        String[] predictions = new String[3];
        predictions[0] = "a pioneer.";
        predictions[1] = "loved by many.";
        predictions[2] = "very wealthy.";

        System.out.print("I will predict your future. Choose 1, 2 or 3: ");
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[choice - 1]);

    }
}
