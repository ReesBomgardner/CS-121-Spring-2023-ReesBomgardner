package abstractClasses;

public class TestClass {
    public static void main(String[] args) {
        StudentCreditHourAbstract student1  = new StudentCreditHourAbstract(54321, "Jane Doe", 3, 60.0);
        System.out.printf("Credit Hour Equivalent Year: %.2f%n", student1.calculateCreditHourYearEquivalent());
        StudentMealSwipesAbstract student2  = new StudentMealSwipesAbstract(54321, "Jane Doe", 3, 3);
        System.out.printf("Meal Swipe Cost Per Week: %.2f%n", student2.calculateMealSwipePrice());
    }
}
