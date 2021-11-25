package Assignment_6;


// Java program to create Thread Safe
// Singleton class
public class GFG
{
    // private instance, so that it can be
// accessed by only by getInstance() method
    private static GFG instance;

    private GFG()
    {
        // private constructor
    }

    //synchronized method to control simultaneous access
    synchronized public static GFG getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new GFG();
        }
        return instance;
    }
}


