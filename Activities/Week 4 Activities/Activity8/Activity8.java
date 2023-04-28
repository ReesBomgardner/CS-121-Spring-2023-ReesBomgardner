package Activity8;
import java.util.Scanner;
public class Activity8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students, studentNum = 1, testsPerStudent, testNum = 1, score1, score2 = 0, average;
        System.out.println("Enter number of students");
        students = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of tests per student");
        testsPerStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= students; i++){
            System.out.println("Student number " + studentNum + "\n-----------------------------");
            int j;
            for (j = 0; j <+ testsPerStudent; j++){
                System.out.println("Enter score " + testNum + ":");
                score1 = Integer.parseInt(scanner.nextLine());
                score2 = score1 + score2;
                testNum++;
            }
            testNum = 1;
            average = score2 / j;
            System.out.println("The average for student " + studentNum + " is " + average +"%\n\n");
            score1 = 0;
            score2 = 0;
            studentNum++;
        }
    }
}
