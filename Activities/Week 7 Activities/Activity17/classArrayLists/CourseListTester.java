package classArrayLists;
import java.util.Scanner;
public class CourseListTester {
    public static void main(String[] args){
        CourseInfo demo = new CourseInfo();
        int i = 1;
        while(true){
            String courseName;
            double gpa;
            int score;
            char letterGrade;
            String quit;
            Scanner console = new Scanner(System.in);
            System.out.println("What is the course name?");
            courseName = console.nextLine();
            System.out.println("What is the GPA?");
            gpa = console.nextDouble();
            System.out.println("What is the score?");
            score = console.nextInt();
            System.out.println("What is the letter grade?");
            letterGrade = console.next().charAt(0);
            console.nextLine();
            demo.addToList(courseName, gpa, score, letterGrade);
            System.out.println("Type q to quit or anything else to continue.");
            quit = console.nextLine();
            if(quit.equals("q")) {
                break;
            }
        }
        demo.print();
    }
}
