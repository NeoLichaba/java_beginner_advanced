
package Chap01_ProgrammingThreads;

import java.util.ArrayList;

/* Listing 1.4
 * Program is a improved version of the countdown app
 * CountDownClock class adds getTime method that gets the current time in the countdown,
 * LaunchEvent class checks countdown time every 10 milliseconds and triggers events only when countdown clock says it's time
 * LaunchEvent class monitors status of CountDownClock w/o them being too close to one another - interface used as a buffer
 * Interface defines a method that gets the current status of the clock
 * CountDownlass implements that interface and LaunchEvent class uses any object that implements this interface to the get the time
 * @author Neo
 */
public class P486_CountDownApp {
    public static void main(String[] args)
    {
        CountDownClock clock = new CountDownClock(20);                          //starting time specified in parameter
        ArrayList<Runnable> events = 
            new ArrayList<Runnable>();                                          //ArrayList of LaunchEvent onjects
        events.add(new LaunchEvent(16,                                          //LaunchEvent object created that passes the count
            "Flood the pad!", clock));                                          //LaunchEvent objects call clock's abort method if necessary
        events.add(new LaunchEvent(6,
            "Start engines!", clock));
        events.add(new LaunchEvent(0,
            "Liftoff!", clock));
        clock.start();                                                          //clock is started
        for (Runnable e : events)                                               //enhance loop used, object from Runnable interface iterates through 
            new Thread(e).start();
    }
}
interface TimeMonitor                                                           //TimeMonitor interface
{
    int getTime();                                                              //getTime method defined, represents number of seconds left on the countdown timer
}
class CountDownClock extends Thread 
    implements TimeMonitor                                                      //CountDownClock implements TimeMonitor
{
    private int t;                                                              //t stores the current value of the countdownclock; 
                                                                                //t accessed by constructor, run method and getTime method 
    public CountDownClock(int start)                                            //start time passed for countdown
    {
        this.t = start;
    }
    public void run()
    {
        for (; t >= 0; t--)                                                     //for loop in the run method tests and decrements the t variable
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        }
    }
    public int getTime()                                                        //getTime method returns value of t variable
    {
        return t;
    }
}
class LaunchEvent implements Runnable                                           //start of the LaunchEvent class
{
    private int start;
    private String message;
    TimeMonitor tm;                                                             //TimeMonitor tm accesses CountDownClock	
    public LaunchEvent(int start, String message,
        TimeMonitor monitor)                                                    //reference to TimeMonitor passed in constructor
    {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }
    public void run()
    {
       boolean eventDone = false;
        while (!eventDone)
        {
            try
            {
                Thread.sleep(10);                                               //sleeps for 10 milliseconds
            }
            catch (InterruptedException e)
            {}
            if (tm.getTime() <= start)                                          //calls the getTime method to assess whether it's time to start the event
            {
                System.out.println(this.message);                               //if time to start the event, message displayed
                eventDone = true;
            }
        }
    }

}
