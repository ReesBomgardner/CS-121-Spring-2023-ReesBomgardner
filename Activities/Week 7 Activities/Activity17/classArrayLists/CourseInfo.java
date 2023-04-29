package classArrayLists;
import java.util.ArrayList;
public class CourseInfo {
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Character> letterGrades = new ArrayList<>();
    ArrayList<Double> gpas = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    public void addToList(String name, double gpa, int score, char letterGrade) {
        names.add(name);
        gpas.add(gpa);
        scores.add(score);
        letterGrades.add(letterGrade);
    }

    public void print() {
        System.out.printf("Course Name     " + "GPA     " + "Score     " + "Letter Grade\n");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf(names.get(i) + "         " + gpas.get(i) + "     " + scores.get(i) + "       " + letterGrades.get(i) + "     \n");
            System.out.println("-----------------------------------------------------------");
        }
    }
}