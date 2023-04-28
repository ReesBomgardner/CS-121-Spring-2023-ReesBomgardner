package setAndIteratiorActivity;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class StudentSet {
    Set<String> students = new HashSet<String>();
    public void addStudents() {
        Scanner console = new Scanner(System.in);
        String studentOrQuit = " ";
        while (!Objects.equals(studentOrQuit, "q")) {
            System.out.println("Enter students, or enter q to quit.");
            studentOrQuit = console.nextLine();
            if (Objects.equals(studentOrQuit, "q")) {
                break;
            }
            students.add(studentOrQuit);
        }
    }
    public void displayStudents() {
        Iterator<String> it = students.iterator();
        System.out.println("Students: " );
        Iterator value = students.iterator();
        while (value.hasNext())
            System.out.println(value.next());
    }
}
