package sec08_arrays;

public class vid037_intro_arrays {
    public static void main(String[] args) {
        int[] nums = {75, 29, 350, 7, 204, 88, 67};
//        System.out.println(b[4]);
//        b[4] = 777;
//        System.out.println(b[4]);
//        System.out.println(b[0]);
//        for (int i = 0; i < b.length; i++) {
//        for (int i = nums.length - 1; i >= 0; i-= 1) {
//            System.out.println(nums[i]);

        int count = 0;
        int sumOfNums = 0;

        for (int i = 0; i < nums.length; i++) {
            // Count all numbers over 100
            if (nums[i] > 100) {
//                System.out.println(nums[i]);
                count++;
            }
            // Add up all numbers
            sumOfNums = sumOfNums + nums[i];
        }
        System.out.println("Count of values greater than 100: " + count);
        double mean = (double) sumOfNums / nums.length;
        System.out.format("Mean: %.2f", mean);
    }
}
