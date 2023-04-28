package Activity15;
import java.util.Scanner;

public class Activity15 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String[] movieNames = new String[5];
        String[] directorName = new String[5];
        int[] ratings = new int[5];
        for (int i = 0; i <5; i++){
            System.out.println("Movie name: ");
            movieNames[i] = console.nextLine();
            System.out.println("Director's Name: ");
            directorName[i] = console.nextLine();
            System.out.println("Rating out of 10 (use numbers): ");
            ratings[i] = Integer.parseInt(console.nextLine());
        }
        System.out.printf("%-10s %10s\n", "Movie name and director", "Rating");
        System.out.println("-----------------------------------------------");
        for (int i= 0; i < movieNames.length; i++){
            System.out.printf("%-10s %s10 \n", movieNames[i] + " directed by " + directorName[i] + "---", ratings[i] + "/10");
        }
        console.close();
    }
}
