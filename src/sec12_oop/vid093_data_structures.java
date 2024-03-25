package sec12_oop;

public class vid093_data_structures {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp.name = "Jeff";
        emp.age = 32;
        emp.jobTitle = "Construction Worker";

        emp2.name = "Sarah";
        emp2.age = 28;
        emp2.jobTitle = "Electrician";

        emp3.name = "Bill";
        emp3.age = 37;
        emp3.jobTitle = "Project Manager";

        bar(emp3);
        bar(emp);
        bar(emp2);

        System.out.println(emp.age);
        System.out.println(emp2.age);
        System.out.println(emp3.age);
    }

    static void bar(Employee e) {
        System.out.println(e.name + " is " + e.age + " years old and is a " + e.jobTitle);
        e.age = 20;
    }
}
