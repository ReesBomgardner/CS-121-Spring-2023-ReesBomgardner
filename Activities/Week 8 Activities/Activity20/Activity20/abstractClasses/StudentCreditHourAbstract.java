package abstractClasses;
public class StudentCreditHourAbstract extends StudentAbstract {
    private double creditHours;
    public StudentCreditHourAbstract(int studentID, String name, int year, double creditHours){
        super(studentID, name, year);
        this.creditHours = creditHours;
    }
    public void setCreditHours(double creditHours){
        this.creditHours = creditHours;
    }
    public double getCreditHours() {
        return creditHours;
    }
    @Override
    public String toString(){
        return super.toString() + String.format("Credit Hour Equivalent: %.2f%n",
                getCreditHours());
    }
    @Override
    public double calculateCreditHourYearEquivalent()
    {
        return creditHours / 30;
    }

    @Override
    public double calculateMealSwipePrice() {
        return 0;
    }
}
