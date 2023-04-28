package interfaces;

public class StudentCreditHourInterface implements CreditHourYearEquivalent {
    private int studentID;
    private String name;
    private int year;
    private double creditHours;

    public StudentCreditHourInterface(int studentID, String name, int year, double creditHours) {
        this.studentID = studentID;
        this.name = name;
        this.year = year;
        this.creditHours = creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public double calculateCreditHourYearEquivalent() {
        return creditHours / 30;
    }
}