package genericsActivity;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("alpha", "beta", "gamma", "delta", "epsilon"));
        System.out.print("Integer arrayList: ");
        generic.printArrayList(intArray);
        System.out.print("Double arrayList: ");
        generic.printArrayList(doubleArray);
        System.out.print("Char arrayList: ");
        generic.printArrayList(charArray);
        System.out.print("String arrayList: ");
        generic.printArrayList(stringArray);
    }
}
