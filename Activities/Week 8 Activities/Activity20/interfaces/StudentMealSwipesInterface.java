package interfaces;
public class StudentMealSwipesInterface implements MealSwipePrice {
    private int studentID;
    private String name;
    private int year;
    private int mealSwipesInterface;
    public StudentMealSwipesInterface(int studentID, String name, int year, int mealSwipesInterface){
        this.studentID = studentID;
        this.name = name;
        this.year = year;
        this.mealSwipesInterface = mealSwipesInterface;
    }
    public void setMealSwipesInterface(int mealSwipesInterface){
        this. mealSwipesInterface = mealSwipesInterface;
    }
    public int getMealSwipesInterface(){
        return mealSwipesInterface;
    }
    public double calculateMealSwipePrice() {return mealSwipesInterface * 7 * 9;}
}
