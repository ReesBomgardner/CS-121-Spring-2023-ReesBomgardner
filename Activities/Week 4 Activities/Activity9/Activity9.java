package Activity9;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        String chosen, color = " ";
        int random, correct = 0;
        System.out.println("Welcome to the guessing game!\nThe program with randomly select a color, red, green, blue, orange, or yellow.\nTry to guess which one!\nGood luck!\n");
        for (int i = 1; i <= 10; i++) {
            random = randomNumber.nextInt(5);
            System.out.println(i + ". What color has the computer chosen?");
            chosen = scanner.nextLine();
            switch (random) {
                case 0:
                    color = "red";
                    break;
                case 1:
                    color = "green";
                    break;
                case 2:
                    color = "blue";
                    break;
                case 3:
                    color = "orange";
                    break;
                case 4:
                    color = "yellow";
                    break;
                default:
                    System.out.println("You didn't input valid information.\n");
            }
            if (chosen.equals(color)) {
                System.out.println("You guessed correctly! The color was " + color + ".\n");
                correct++;
            } else {
                System.out.println(("That is incorrect. The color was " + color + ".\n"));
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("You got " + correct + " out of 10 correct.");
    }
}