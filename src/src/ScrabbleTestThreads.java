public class ScrabbleTestThreads {

    public static void main(String[] args) {

        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        Runnable getID = new GetTheID();

        new Thread(getID).start();
        new Thread(getTiles).start();

        new Thread(getTilesAgain).start();
    }

}
