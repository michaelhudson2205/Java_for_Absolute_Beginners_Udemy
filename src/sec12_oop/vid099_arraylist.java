package sec12_oop;

import java.util.ArrayList;

public class vid099_arraylist {
    public static void main(String[] args) {
        ArrayList<String> sal = new ArrayList<String>();
        sal.add("toaster");
        sal.add("fridge");
        sal.add("kettle");
//        sal.remove(1);

        System.out.println(sal.indexOf("kettle"));

        System.out.println(sal.get(1));
        sal.set(1, "microwave");
        System.out.println(sal.get(1));
        System.out.println(sal.size());
        sal.clear();
        System.out.println(sal.size());
    }
}
