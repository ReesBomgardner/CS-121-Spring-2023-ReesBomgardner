package Activity7;
import java.util.Scanner;
import java.util.Random;
public class Activity7 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = randomNumber.nextInt(100);
        int guesses = 0, result = 0, guess;
        String quit;
        System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up: ");
        while (result == 0) {
            quit = scanner.nextLine();
            if (quit.equals("q")) {
                result++;
                System.out.println("Quitter! The number was " + num + ".");
                break;
            }
            guess = Integer.parseInt(quit);
            guesses++;
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input");
            }
            else if (guess == num) {
                result++;
                System.out.println("Correct!\nNumber of guesses: " + guesses);
            }
            else if (guess < num) {
                System.out.println("Too low. Guess again:");
            }
            else if (guess > num) {
                System.out.println("Too high. Guess again");
            }
        }
    }
}
