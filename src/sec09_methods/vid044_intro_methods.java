package sec09_methods;

public class vid044_intro_methods {
    public static void main(String[] args) {
        System.out.println("main: " + 19);
        bar();
        foo();
        System.out.println("main: " + 24);

    }

    public static void foo() {
        int x = 50;
        System.out.println("foo: " + x);
        System.out.println("foo: " + 16);
    }

    public static void bar() {
        foo();
        System.out.println("bar: " + 12);
    }
}
