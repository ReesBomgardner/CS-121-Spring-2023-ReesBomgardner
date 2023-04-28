package project2;

public class Pokemon {
    public static String names;
    public static int hitPoints;
    public static String moves;
    public static int movePowers;
    public static int attackSpeeds;

    //Set variables to proper values
    public static void pokemonConstructor(String name, int hitPoint, String move, int movePower, int attackSpeed){
        names = getName();
        hitPoints = getHitPoints();
        moves = getMoves();
        movePowers = getMovePowers();
        attackSpeeds = getAttackSpeeds();
    }

    //Getters
    public static String getName(){return names;}
    public static int getHitPoints(){return hitPoints;}
    public static String getMoves(){return moves;}
    public static int getMovePowers(){return movePowers;}
    public static int getAttackSpeeds(){return attackSpeeds;}

    //Setters
    public static void setName(String name){names = name;}
    public static void setHitPoints(int hitPoint){hitPoints = hitPoint;}
    public static void setMoves(String move){moves = move;}
    public static void setMovePowers(int movePower){movePowers = movePower;}
    public static void setAttackSpeeds(int attackSpeed){attackSpeeds = attackSpeed;}
    //Displays the statistics of Pokemon
    public static void displayPokemonStats(String name, int hitPoint, String move, int movePower, int attackSpeed){
        System.out.printf("Name:" + name + "\nHit Points:" + hitPoint + "\nMove:" + move +"\nMove Power:" + movePowers + "\nAttack Speed:" + attackSpeeds);
        System.out.println("-----------------------------------------------------------");

    }
}