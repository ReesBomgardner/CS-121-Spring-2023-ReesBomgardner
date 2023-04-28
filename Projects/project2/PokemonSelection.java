package project2;

import java.util.Scanner;

public class PokemonSelection extends Pokemon{
    static Scanner keyboard = new Scanner(System.in);
    Pokemon p = new Pokemon();
    private static void createPokemon() {
        System.out.println("Enter name:");
        setName(names = keyboard.nextLine());
        System.out.println("Enter HP:");
        setHitPoints(hitPoints = Integer.parseInt(keyboard.nextLine()));
        System.out.println("Enter move:");
        setMoves(moves = keyboard.nextLine());
        System.out.println("Enter move's power:");
        setMovePowers(movePowers = Integer.parseInt(keyboard.nextLine()));
        System.out.println("Enter attack speed:");
        setAttackSpeeds(attackSpeeds = Integer.parseInt(keyboard.nextLine()));
        pokemonConstructor(names, hitPoints, moves, movePowers, attackSpeeds);
    }
    public static void assignPokemon() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Player "+ i + ": Select a Pokemon and enter its stats");
            createPokemon();
            displayPokemonStats(names, hitPoints, moves, movePowers, attackSpeeds);
            keyboard.close();
        }
    }
}
