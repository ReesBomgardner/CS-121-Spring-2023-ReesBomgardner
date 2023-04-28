package HashMapActivity;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        HashMap1 test = new HashMap1();
        System.out.println("Course List\n------------------------------");
        test.addToGradesList("CS121", 100);
        test.addToGradesList("BIO111", 93);
        test.addToGradesList("JAPA102", 92);
        test.displayGrades();
        test.removeFromGradesList("JAPA102");
        System.out.println("\n\n\nAdjusted Course List\n------------------------------");
        test.displayGrades();
    }
}
