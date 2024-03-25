package sec09_methods;

public class vid046_returning_data {
    public static void main(String[] args) {
        foo(3);
//        double val = bar();
        System.out.println("main is printing the return from bar(): " + bar());
    }

    public static void foo(int a) {
        if (a < 5) {
            return;
        }
        System.out.println("from foo: " + a);
    }

    public static double bar () {
        return 56.5;

    }
}
