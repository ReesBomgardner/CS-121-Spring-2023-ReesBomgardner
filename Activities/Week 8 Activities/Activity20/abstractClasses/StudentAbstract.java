package abstractClasses;

public abstract class StudentAbstract {
    private int studentID;
    private String name;
    private int year;
    public StudentAbstract(int studentID, String name, int year){
        this.studentID = studentID;
        this.name = name;
        this.year = year;
    }
    public void setID(int studentID){
        this.studentID = studentID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nStudent ID: %d%n Year: %d%n", name, studentID, year);
    }
    public abstract double calculateCreditHourYearEquivalent();
    public abstract double calculateMealSwipePrice();
}
