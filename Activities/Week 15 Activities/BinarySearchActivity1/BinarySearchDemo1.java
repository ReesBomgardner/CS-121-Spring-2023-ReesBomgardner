package BinarySearchActivity1;

import java.util.ArrayList;

public class BinarySearchDemo1 {
    public int binarySearch1(int key, ArrayList<Integer> array) {
        int counter = 0;
        int low = 0;
        int high = array.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high && array.get(mid) !=key) {
            if (array.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
            System.out.println("comparison: " + ++counter);
        }
        if (low > high) {
            mid = - 1;
        }
        return mid;
    }
}
