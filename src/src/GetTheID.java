import java.util.LinkedList;

public class GetTheID implements Runnable {
    @Override
    public void run() {
        Singleton newSingleton = Singleton.getInstance();
        //Return the instance ID for the singleton.
        System.out.println("Instance of Singleton: " + System.identityHashCode(newSingleton));
        }
}
