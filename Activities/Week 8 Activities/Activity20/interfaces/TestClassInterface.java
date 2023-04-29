package interfaces;

public class TestClassInterface {
    public static void main(String[] args) {
        StudentCreditHourInterface student1  = new StudentCreditHourInterface(54321, "Jane Doe", 3, 60.0);
        System.out.printf("Credit Hour Equivalent Year: %.2f%n", student1.calculateCreditHourYearEquivalent());
        StudentMealSwipesInterface student2  = new StudentMealSwipesInterface(12345, "John Doe", 3, 3);
        System.out.printf("Meal Swipe Cost Per Week: %.2f%n", student2.calculateMealSwipePrice());
    }
}
