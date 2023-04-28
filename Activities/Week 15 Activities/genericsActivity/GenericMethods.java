package genericsActivity;
import java.util.ArrayList;
public class GenericMethods {
    public <E> void printArrayList(ArrayList<E> inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
