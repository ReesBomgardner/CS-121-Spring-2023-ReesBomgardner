package Activity16;

public class ArrayDemo1 {
    public static void main(String[] args){
        int[][] array1 = { {1, 2, 3}, {4 ,5 , 6}, {7, 8 ,9}, {10, 11, 12} };
        for (int[] row : array1){
            for (int column : row){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();
    }
}
