package sec08_arrays;

public class vid042_foreach {
    public static void main(String[] args) {
        double[] da = new double[] {25.92, 1.34, -76.24, 833.11, 76.084};

        for (int i = 0; i < da.length; i++) {
            double e = da[i];
            System.out.println(e);
        }

        System.out.println();

        for (double e : da) {
            System.out.println(e);
        }

        System.out.println();

        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        for (String pl : planets) {
            System.out.println(pl);
        }
    }
}
