package Project1;
import java.util.Random;
import java.util.Scanner;
public class Project1 {
    static Scanner scanner = new Scanner(System.in);
    static String name1 = " ", name2 = " ";
    static int hp1 = 0, hp2 = 0;
    static String move1 = " ", move2 = " ";
    static int mp1 = 0, mp2 = 0;
    static int ats1 = 0, ats2 = 0;
    static int p1 = 0, p2 = 0;
    public static void main(String[] args) {
        int round = 1, rounds = 1;
        System.out.println("Enter an odd number of rounds to play.");
        round = scanner.nextInt();
        for (int i = 1; i <= round; i++) {
            System.out.println("Round " + rounds + "\n-------");
            PokemonAttributes();
            while ((hp1 != 0) && (hp2 != 0)) {
                if (ats1 > ats2) {
                    hp2 = hp2 - mp1;
                    hp1 = hp1 - mp2;
                    if (hp2 <= 0) {
                        p1 = p1 + 1;
                        System.out.println("Player 1's " + name1 + " wins this round!\n");
                        hp1 = 0;
                        hp2 = 0;
                    }
                    if (hp1 <= 0) {
                        p2 = p2 + 1;
                        System.out.println("Player 2's " + name2 + " wins this round!\n");
                        hp1 = 0;
                        hp2 = 0;
                    }
                }
                else if (ats2 > ats1) {
                    hp1 = hp1 - mp2;
                    hp2 = hp2 - mp1;
                    if (hp1 <= 0) {
                        p2 = p2 + 1;
                        System.out.println("Player 2's " + name2 + " wins this round!\n");
                        hp1 = 0;
                        hp2 = 0;
                    }
                    if (hp2 <= 0) {
                        p1 = p1 + 1;
                        System.out.println("Player 1's " + name1 + " wins this round!\n");
                        hp1 = 0;
                        hp2 = 0;
                    }
                }
                else if (ats1 == ats2) {
                    Random randomNumber = new Random();
                    int random = randomNumber.nextInt(2);
                    if (random == 0) {
                        hp2 = hp2 - mp1;
                        if (hp2 <= 0) {
                            p1 = p1 + 1;
                            System.out.println("Player 1's " + name1 + " wins this round!\n");
                            hp1 = 0;
                            hp2 = 0;
                        }
                        if (hp1 <= 0) {
                            p2 = p2 + 1;
                            System.out.println("Player 2's " + name2 + " wins this round!\n");
                            hp1 = 0;
                            hp2 = 0;
                        }
                    }
                    else if (random == 1) {
                        hp1 = hp1 - mp2;
                        if (hp1 <= 0) {
                            p2 = p2 + 1;
                            System.out.println("Player 2's " + name2 + " wins this round!\n");
                            hp1 = 0;
                            hp2 = 0;
                        }
                        if (hp2 <= 0) {
                            p1 = p1 + 1;
                            System.out.println("Player 1's " + name1 + " wins this round!\n");
                            hp1 = 0;
                            hp2 = 0;
                        }
                    }
                }
                    else {
                        System.out.println("You didn't input valid information for the attack speed");
                    }
                }
                rounds = rounds + 1;
                Wins();
            }
            FinalScores();
        }
    public static void PokemonAttributes() {
        name1 = scanner.nextLine();
        System.out.println("What is the name of the first player's Pokemon?");
        name1 = scanner.nextLine();
        System.out.println("What is " + name1 + "'s hit points?");
        hp1 = scanner.nextInt();
        move1 = scanner.nextLine();
        System.out.println("What is the name of " + name1 + "'s move?");
        move1 = scanner.nextLine();
        System.out.println("What is the power of " + move1 +"?");
        mp1 = scanner.nextInt();
        System.out.println("What is the attack speed of " + name1 + "?");
        ats1 = scanner.nextInt();

        name2 = scanner.nextLine();
        System.out.println("What is the name of the second player's Pokemon?");
        name2 = scanner.nextLine();
        System.out.println("What is " + name2 + "'s hit points?");
        hp2 = scanner.nextInt();
        move2 = scanner.nextLine();
        System.out.println("What is the name of " + name2 + "'s move?");
        move2 = scanner.nextLine();
        System.out.println("What is the power of " + move2 +"?");
        mp2 = scanner.nextInt();
        System.out.println("What is the attack speed of " + name2 + "?");
        ats2 = scanner.nextInt();
    }
    public static void Wins(){
        System.out.println("Wins:\n-----\nPlayer 1: " + p1 + "\nPlayer 2: " + p2 + "\n");

    }
    public static void FinalScores() {
        int score = 0;
        String win = " ";
        if (p1 > p2) {
            score = 0;
        }
        else if (p1 < p2) {
            score = 1;
        }
        else {
            score = 2;
        }
        switch (score){
            case 0: win = "Player 1 wins the game!";
                break;
            case 1: win = "Player 2 wins the game!";
                break;
            case 2: win = "Something went wrong...Player 1 and Player 2 tied the game!";
        }
        System.out.println(win);
    }
}