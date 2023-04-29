package stringArrayList;

public class ArrayListTester {
    public static void main(String[] args){
        StringArrayList demo = new StringArrayList();
        demo.addString("Rees");
        demo.addString("Harry");
        demo.addString("Jason");
        System.out.printf("Names contains %s names.%n", demo.getSizeOfNameList());
        demo.displayNames1();

        System.out.printf("%nRemove first name: %s%n", demo.getName(0));
        demo.removeName(0);
        System.out.printf("%nNames contains %s names.%n", demo.getSizeOfNameList());
        demo.displayNames2();
    }
}
