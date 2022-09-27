package Chap01_ProgrammingThreads;

import java.util.ArrayList;

/* Program demonstrates CountDownApplication with Aborts
 * It aborts the countdown method if something goes wrong with any of the launch events
 
 * Listing 1.13
 *
 * @author Neo
 */
public class P499_CountDownApp {                                                //remains the same as previously defined

    public static void main(String[] args) {

        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!", clock));
        events.add(new LaunchEvent(6, "Start engines!", clock));
        events.add(new LaunchEvent(0, "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }

}

interface TimeMonitor {

    int getTime();

    void abortCountDown();                                                      //abortCountDown method added which communicates that the countdown should be aborted
}

class CountDownClock extends Thread
        implements TimeMonitor {

    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        boolean aborted = false;                                                //aborted variable indicates whether thread has been interrupted
        for (; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                aborted = true;                                                 //set to true if InterruptedException is caught
            }
            if (Thread.interrupted()) {
                aborted = true;                                                 //set to true if Thread.interrupted() returns true
            }
            if (aborted)                                                        //if aborted field is set to true = thread interrupted
            {
                System.out.println(
                        "Stopping the clock!");
                break;                                                          //thread exited and terminated
            }
        }
    }

    public int getTime() {
        return t;
    }

    @Override
    public synchronized void abortCountDown()                                   //abortCountDown method is synchronized
                                                                                //LaunchEvent objects can call it at any time
    {
        Thread[] threads
                = new Thread[Thread.activeCount()];                             //array created that is large enough to hold all active threads. Number of active threads is provided by activeCount method
        Thread.enumerate(threads);                                              //enumerate method of the Thread class to copy all the active threads into array                                        
        for (Thread t : threads)                                                //enhanced for loop is used to call the interrupt method on all active threads. Shuts down everything
        {
            t.interrupt();
        }
    }
}

class LaunchEvent implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false;                                                //boolean variables indicate whether thread has been interrupted or not
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true;                                                 //boolean variables is set if caught                                          
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;                                               //if aborted variable = true, message printed
                System.out.println("ABORT!!!!");
                tm.abortCountDown(); //→108
            }
            if (Thread.interrupted()) {
                aborted = true; //→111                                          //variable set if caught Thread.interrupted() returns true                   
            }
            if (aborted) //→112                                                 //variable tested 
            {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}
