package sec09_methods;

public class vid047_passing_returning {
    public static void main(String[] args) {
//        System.out.println(add(13, 6));
//        System.out.println(add(279, 163));
//        System.out.println(add(13, 6) * add(279, 163));
//        System.out.println(add(add(13, 6), add(279, 163)));
        System.out.println(coneVolume(4, 5));
        System.out.format("%.2f\n", coneVolume(4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double coneVolume(double radius, double height) {
        return Math.PI * radius * radius * height / 3;
    }
}
