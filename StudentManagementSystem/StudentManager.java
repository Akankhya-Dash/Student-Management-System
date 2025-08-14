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
