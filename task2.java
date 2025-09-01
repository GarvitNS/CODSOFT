/* 2nd task solution*/
import java.util.*;

// Class to hold student marks and calculate the grade.
class Student {
    int total;
    double average;
    String grade;

    
    void calculateMarks(int subjects, Scanner sc) {
        total = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }
        average = total * 1.0 / subjects;
    }

    
    void assignGrade() {
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // Method to display results
    void displayResults() {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hellllllooooooo, Welcome to Student Grade Calculator!");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Create Student object
        Student s = new Student();
        s.calculateMarks(subjects, sc);
        s.assignGrade();
        s.displayResults();

        sc.close();
    }
}
