package abstractClasses;
public class StudentMealSwipesAbstract extends StudentAbstract {
    private int mealSwipesAbstract;
    public StudentMealSwipesAbstract(int studentID, String name, int year, int mealSwipesAbstract){
        super(studentID, name, year);
        this.mealSwipesAbstract = mealSwipesAbstract;
    }
    public void setMealSwipesAbstract(int mealSwipesAbstract){
        this. mealSwipesAbstract = mealSwipesAbstract;
    }
    public int getMealSwipesAbstract(){
        return mealSwipesAbstract;
    }
    @Override
    public String toString() {
        return String.format("Name: %s%nID: %d%nYear: %d%nMeal Swipes: %.2f%n",
                getName(), getStudentID(), getYear(), getMealSwipesAbstract());
    }

    @Override
    public double calculateCreditHourYearEquivalent() {
        return 0;
    }

    @Override
    public double calculateMealSwipePrice() {return mealSwipesAbstract * 7 * 9;}
}
