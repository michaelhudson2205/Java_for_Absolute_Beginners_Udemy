package sec12_oop;

public class vid096_encapsulation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 9);

        Rectangle r2 = new Rectangle(8, 4);

        System.out.println(r1.getHeight() + ", " + r1.getWidth());
        System.out.println(r2.getHeight() + ", " + r2.getWidth());
    }
}
