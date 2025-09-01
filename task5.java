/*this is my last and final task, task no. 5th of java internship at codesoft.                */
import java.util.*;

// Class to represent individual student
class Student {
    String name;
    int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
}

// Class to manage students
class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add a new student
    void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        Student s = new Student(name, roll, grade);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // Remove a student by roll number
    void removeStudent() {
        System.out.print("Enter roll number to remove: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == roll) {
                students.remove(i);
                System.out.println("Student removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Search a student by roll number
    void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        boolean found = false;

        for (Student s : students) {
            if (s.rollNumber == roll) {
                System.out.println("Student Found: Name: " + s.name + ", Roll: " + s.rollNumber + ", Grade: " + s.grade);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Display all the students
    void displayAll() {
        if (students.size() == 0) {
            System.out.println("No students to display!");
            
        }

        System.out.println("\nAll Students:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Roll: " + s.rollNumber + ", Grade: " + s.grade);
        }
    }

    // Main menu for thee system
    void menu() {
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

// Main class
public class StudentManagementMain {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.menu();
    }
}
