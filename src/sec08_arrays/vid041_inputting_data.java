package sec08_arrays;

import java.util.Scanner;

public class vid041_inputting_data {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i = 0; i < numberOfLaps; i++) {
            System.out.print("Lap " + (i + 1) + " time: ");
            lapTimes[i] = scanner.nextDouble();
        }

        double fastestTime = lapTimes[0];
        int lapNumber = 0;
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
                lapNumber = i + 1;
            }
        }

        System.out.println("Fastest time: " + fastestTime + " seconds, on Lap no. " + lapNumber + ".");
    }
}
