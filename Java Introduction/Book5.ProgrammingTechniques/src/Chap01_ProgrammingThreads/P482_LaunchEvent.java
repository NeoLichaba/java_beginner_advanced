
package Chap01_ProgrammingThreads;

/* Listing 1.2
 * Program illustrates creation and execution in a Runnable interface
 *
 * @author Neo
 */
public class P482_LaunchEvent implements Runnable {                             //Implements Runnable interface
    
    private int start;                                                          //parameters within constructor stored in private fields
    private String message;
    
    public P482_LaunchEvent(int start, String message)                          //Constructor accepts 2 parameters - when the program will start and message to be displayed
    
    {
        this.start = start;                                                     //this - refers to the current object within this method
        this.message = message;
    }
    @Override
    public void run()                                                           
    {
        try
        {
            Thread.sleep(20000 - (start * 1000));                               //sleep method called until desired countdown time arrives
                                                                                //time is milliseconds
        }
        catch (InterruptedException e)
        {}
        System.out.println(message);                                            //displays message
    }
}

