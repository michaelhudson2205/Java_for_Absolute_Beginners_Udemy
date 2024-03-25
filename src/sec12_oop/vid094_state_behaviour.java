package sec12_oop;

public class vid094_state_behaviour {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.open();

        if (dd.isOpen) {
            System.out.println("Driver's door is open.");
        }
        else {
            System.out.println("Driver's door is closed.");
        }

    }
}
