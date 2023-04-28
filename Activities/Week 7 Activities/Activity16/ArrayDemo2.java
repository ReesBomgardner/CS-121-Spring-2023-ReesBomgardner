package Activity16;

public class ArrayDemo2 {
    public static void main(String[] args){
        int[][] array1 = new int[4][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;
        array1[2][0] = 7;
        array1[2][1] = 8;
        array1[2][2] = 9;
        array1[3][0] = 10;
        array1[3][1] = 11;
        array1[3][2] = 12;
        for (int row = 0; row < array1.length; row++){
            for (int column = 0; column < array1[row].length; column++){
                System.out.printf("%d ", array1[row][column]);
            }
            System.out.println();
        }
    }
}
