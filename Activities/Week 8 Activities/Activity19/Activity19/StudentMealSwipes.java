package Activity19;

public class StudentMealSwipes extends Student {
    private int mealSwipes;
    public StudentMealSwipes(int studentID, String name, int year, int mealSwipes){
        super(studentID, name, year);
        this.mealSwipes = mealSwipes;
    }
    public void setMealSwipes(int mealSwipes){
        this. mealSwipes = mealSwipes;
    }
    public int getMealSwipes(){
        return mealSwipes;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nStudent ID: %d%nYear: %d%nMeal Swipes: %d%n", getName(), getStudentID(), getYear(), getMealSwipes());
    }
}
