package sec09_methods;

public class vid045_passing_data {
    public static void main(String[] args) {
        int var;
        var = 5;
//        foo(10);
        foo(var, 57.5, "caramel");
    }

    public static void foo(int a, double b, String c) {
        System.out.println(a + b + c);
    }
}
