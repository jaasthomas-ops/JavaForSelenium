import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        
        char grade;
        
        if (marks >= 80 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 60 && marks < 80) {
            grade = 'B';
        } else if (marks >= 0 && marks < 60) {
            grade = 'C';
        } else {
            System.out.println("Invalid marks");
            sc.close();
            return;
        }
        
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
