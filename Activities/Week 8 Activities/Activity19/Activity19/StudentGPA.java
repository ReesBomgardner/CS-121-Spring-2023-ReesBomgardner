package Activity19;

public class StudentGPA extends Student{
    private double GPA;
    public StudentGPA(int studentID, String name, int year, double GPA){
        super(studentID, name, year);
        this.GPA = GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nStudent ID: %d%nYear: %d%nGPA: %.2f%n", getName(), getStudentID(), getYear(), getGPA());
    }
}
