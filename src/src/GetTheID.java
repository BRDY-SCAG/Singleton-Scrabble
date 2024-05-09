import java.util.LinkedList;

public class GetTheID implements Runnable { // Returns the hashed id for the singleton class
    @Override
    public void run() { // prints out the Singleton ID
        Singleton newSingleton = Singleton.getInstance();
        //Return the instance ID for the singleton.
        System.out.println("Instance of Singleton: " + System.identityHashCode(newSingleton));
        }
}
