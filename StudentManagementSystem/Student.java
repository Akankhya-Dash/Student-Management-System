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
