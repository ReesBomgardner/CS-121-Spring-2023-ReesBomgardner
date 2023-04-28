package linkedListActivity;
import java.util.Iterator;
import java.util.LinkedList;
public class Student {
    String first, last, major, classStanding;
    int ID;
    double gpa;
    LinkedList<String> courseList = new LinkedList<>();
    public void constructor(String firstName, String lastName, int IDs, String Major, String ClassStanding) {
        first = firstName;
        last = lastName;
        ID = IDs;
        major = Major;
        classStanding = ClassStanding;
    }
    public void addCourse(String course) {
        courseList.add(course);
    }
    public void removeCourse(String course) {
        courseList.remove(course);

    }
    public String getStudentInfo() {
        String studentInfo = (first + " " + last + ", " + major + ", " + classStanding + " ");
        return studentInfo;
    }
    public void displayStudentCourses() {
        System.out.printf("Course list: %s%n", courseList);
    }
}
