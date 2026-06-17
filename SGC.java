import java.util.Scanner;

public class SGC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = input.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                System.out.print("Enter marks again: ");
                marks = input.nextInt();
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / numberOfSubjects;

        String grade;

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

        System.out.println("\n===== Result =====");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        input.close();
    }
}