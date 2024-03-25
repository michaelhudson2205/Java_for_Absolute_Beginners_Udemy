package sec07_loops;

public class vid033_break {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
//                break;
                continue;
            }
            System.out.println(i);
        }
    }
}
