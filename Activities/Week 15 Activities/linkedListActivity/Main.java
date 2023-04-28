package linkedListActivity;

import HashMapActivity.HashMap1;

public class Main {
    public static void main(String[] args) {
        Student i1 = new Student();
        i1.constructor("Rees", "Bomgardner", 123456789, "Computer Science","Freshman");
        Student i2 = new Student();
        i2.constructor("Harry", "Soans", 987654321, "Computer Science", "Sophomore");
        i1.addCourse("CS121");
        i1.addCourse("BIO111");
        i1.addCourse("JAPA102");
        String studentInfo = i1.getStudentInfo();
        System.out.println(studentInfo);
        i1.displayStudentCourses();
        i1.removeCourse("JAPA102");
        i1.displayStudentCourses();

        i2.addCourse("CS224");
        i2.addCourse("BIO112");
        i2.addCourse("JAPA201");
        studentInfo = i2.getStudentInfo();
        System.out.println(studentInfo);
        i2.displayStudentCourses();
        i2.removeCourse("BIO112");
        i2.displayStudentCourses();
    }
}
