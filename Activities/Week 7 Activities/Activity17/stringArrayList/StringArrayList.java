package stringArrayList;
import java.util.ArrayList;

public class StringArrayList {
    ArrayList<String> names = new ArrayList<>();
    public void addString(String name){
        names.add(name);
    }
    public void removeName(int index){
        names.remove(index);
    }
    public String getName(int index){
        return names.get(index);
    }
    public int getSizeOfNameList(){
        return names.size();
    }
    public void displayNames1(){
        System.out.printf("Names:%n");
        for (Object name : names){
            System.out.printf("%s%n", name);
        }
    }
    public void displayNames2(){
        System.out.printf("Names:%n");
        for (int i = 0; i < names.size(); i++){
            System.out.printf("%s%n", names.get(i));
        }
    }
}
