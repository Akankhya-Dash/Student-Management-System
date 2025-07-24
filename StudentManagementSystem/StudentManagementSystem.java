
import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Student
class Student {
    private String name;
    private int rollNumber;
    private String course;
    private String email;

    public Student(String name, int rollNumber, String course, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.email = email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Email: " + email);
        System.out.println("--------------------------------");
    }
}

// Class to manage the list of students
class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int rollNumber, String course, String email) {
        students.add(new Student(name, rollNumber, course, email));
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                System.out.println("Student removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        if (students.size() == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }
}

// Main class
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    manager.addStudent(name, roll, course, email);
                    break;

                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollRemove = sc.nextInt();
                    manager.removeStudent(rollRemove);
                    break;

                case 3:
                    manager.displayStudents();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
