import java.util.*;

public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks+"/"+(numSubjects*100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        if(grade=='F'){
            System.out.println("Grade: F. Impprovement is needed. Keep working hard!");
        }
        else{
            System.out.println("Grade: " + grade);
        }
    }
}
