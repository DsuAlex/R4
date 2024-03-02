import java.util.Random;

public class RPS_Player {
    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private String name;
    private Object Option;
    private Random random;

    public RPS_Player(String name){
        this.name = name;
        clear();
    }

    public String getName(){
        return name;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
        return numberOfGamesPlayed;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){
        return numberOfGamesWon;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        if (numberOfGamesPlayed == 0) {
            return 0.0;
        }
        return (double) numberOfGamesWon / numberOfGamesPlayed;
    }

    /**
     * Starts a new game.
     */
    public void clear(){
        numberOfGamesPlayed = 0;
        numberOfGamesWon = 0;
        choice = 0;
    }

    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param   
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public void rpsChoice() {
        choice = random.nextInt(3); // Generates random integer between 0 and 2
    }

    public RPS_Player challenge(RPS_Player anotherPlayer) {
        rpsChoice();
        anotherPlayer.rpsChoice();

        // Compare choices and determine winner
        if (choice == anotherPlayer.choice) {
            return null; // Draw
        } else if ((choice + 1) % 3 == anotherPlayer.choice) {
            numberOfGamesWon++;
            numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            return this; // Current player wins
        } else {
            anotherPlayer.numberOfGamesWon++;
            numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            return anotherPlayer; // Opponent wins
        }
    }

    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer) {
        if (choice == -1) {
            rpsChoice();
        }
        anotherPlayer.rpsChoice();
        return challenge(anotherPlayer); // Reuse challenge logic
    }/**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */

    // TODO: replace this line with your code.
}




    

