import java.util.LinkedList;

public class GetTheTiles implements Runnable { // returns players scrabble boards and first 7 letters

    public void run(){ // prints out the board and tiles the player is assigned to at start.
        // How you create a new instance of Singleton
        Singleton newInstance = Singleton.getInstance();
        // Get unique id for instance object
//        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
        // Get the letters stored in the list
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println("Got Tiles");

    }
}