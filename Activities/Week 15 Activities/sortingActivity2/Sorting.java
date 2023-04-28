package sortingActivity2;

import java.util.Scanner;

public class Sorting {
    static int[] GetArray() {
        int[] unsorted = new int[5];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.printf("Enter integer %d:\n", i + 1);
            unsorted[i] = Integer.parseInt(keyboard.nextLine());
        }
        return unsorted;
    }

    public static int[] SortArray(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int storage1 = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[storage1]) {
                    storage1 = j;
                }
            }
            int storage2 = unsorted[i];
            unsorted[i] = unsorted[storage1];
            unsorted[storage1] = storage2;
        }
        return unsorted;
    }
}