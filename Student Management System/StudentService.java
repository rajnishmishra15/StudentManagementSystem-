import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            students.add(new Student(id, name, marks));
            System.out.println(" Student Added Successfully");

        } catch (Exception e) {
            System.out.println(" Invalid Input");
            sc.nextLine();
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println(" No student records found");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println(" Student not found");
    }

    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Marks: ");
                s.setMarks(sc.nextInt());

                System.out.println(" Student Updated");
                return;
            }
        }
        System.out.println(" Student not found");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println(" Student Deleted");
                return;
            }
        }
        System.out.println(" Student not found");
    }
}
