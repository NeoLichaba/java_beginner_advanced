package Chap01_ProgrammingThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* Listing 1.9 - 1.10
 * 
 * 
 */
public class P493_DoTwoThingsSync {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);                               //2 threads that run a copy of the CountDownClock instance code
    CountDownClockSync clock
            = new CountDownClockSync(20);

    public static void main(String[] args) {
        new P493_DoTwoThingsSync();
    }

    P493_DoTwoThingsSync() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}

class CountDownClockSync extends Thread {

    private int start;

    public CountDownClockSync(int start) {
        this.start = start;
    }

    synchronized public void run() {                                            //synchronized keyword used to ensure only one thread at a time calls the run method
        for (int t = start; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
