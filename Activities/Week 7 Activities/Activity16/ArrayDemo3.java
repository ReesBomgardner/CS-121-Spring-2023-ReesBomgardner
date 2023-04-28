package Activity16;

public class ArrayDemo3 {
    public static void main(String[] args){
        String[][] array1 = { {"Today ", "was ", "the "}, {"first " ,"day " , "of "}, {"March. ", "It ", "was "}, {"70 ", "degrees ", "Fahrenheit"} };
        for (String[] row : array1){
            for (String column : row){
                System.out.printf("%s ", column);
            }
            System.out.println();
        }
        System.out.println();
    }
}
