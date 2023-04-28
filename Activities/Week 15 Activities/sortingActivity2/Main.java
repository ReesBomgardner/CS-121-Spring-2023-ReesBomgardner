package sortingActivity2;

import static sortingActivity2.Sorting.GetArray;
import static sortingActivity2.Sorting.SortArray;

public class Main {
    static public void main(String[] args) {
        Sorting Sorting = new Sorting();
        int [] unsortedArray = GetArray();
        String num1 = String.valueOf(unsortedArray[0]);
        String num2 = String.valueOf(unsortedArray[1]);
        String num3 = String.valueOf(unsortedArray[2]);
        String num4 = String.valueOf(unsortedArray[3]);
        String num5 = String.valueOf(unsortedArray[4]);
        System.out.println("Unsorted array:\n\t"+num1+"  "+num2+"  "+num3+"  "+num4+"  "+num5);
        int [] sortedArray = SortArray(unsortedArray);
        num1 = String.valueOf(sortedArray[0]);
        num2 = String.valueOf(sortedArray[1]);
        num3 = String.valueOf(sortedArray[2]);
        num4 = String.valueOf(sortedArray[3]);
        num5 = String.valueOf(sortedArray[4]);
        System.out.println("Sorted array:\n\t"+num1+"  "+num2+"  "+num3+"  "+num4+"  "+num5);
    }
}
