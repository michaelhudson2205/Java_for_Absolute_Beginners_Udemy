package sec12_oop;

public class vid100_composition {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Joe Bloggs");
        student.setDateOfBirth("30/06/1998");
        student.setStudentHousing(false);
        student.setCourse(new Course());
//        student.getCourse().setTitle("Computer Science");
//        student.getCourse().setLevel("Undergraduate");
//        student.getCourse().setStartDate("07/09/2021");

        Course c = student.getCourse();
        c.setTitle("Computer Science");
        c.setLevel("Undergraduate");
        c.setStartDate("07/09/2021");

        // Some print statements
        System.out.println("Name: " + student.getName());
        System.out.println("DoB: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.hasStudentHousing() ? "yes" : "no"));
        System.out.println("The student " + student.getName() + " is enrolled on the " + student.getCourse().getTitle() + " course due to start on " + student.getCourse().getStartDate());
    }
}
