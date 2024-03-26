package sec12_oop;

public class vid094_state_behaviour {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver";
        dd.open();
        dd.printStatus();

        Door pd = new Door();
        pd.name = "Passenger";
        pd.printStatus();
        pd.open();
        pd.printStatus();
        dd.close();
        dd.printStatus();
    }
}
