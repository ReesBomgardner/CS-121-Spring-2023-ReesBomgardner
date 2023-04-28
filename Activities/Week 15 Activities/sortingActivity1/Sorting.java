package sortingActivity1;
import java.util.Scanner;

public class Sorting {
    static int[] getArray() {
        int [] unsorted = new int[5];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.printf("Enter integer %d:\n", i + 1);
            unsorted[i] = Integer.parseInt(keyboard.nextLine());
        }
        return unsorted;
    }
    public static int[] sortArray(int[] unsorted) {
        int k = unsorted.length;
        for (int i = 0; i < k; i++){
            for (int j = i+1; j < k; j++) {
                if (unsorted[j] < unsorted[i]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }
}
