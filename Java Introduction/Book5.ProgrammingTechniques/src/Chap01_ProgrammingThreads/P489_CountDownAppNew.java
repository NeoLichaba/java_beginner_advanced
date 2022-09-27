package Chap01_ProgrammingThreads;


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* Listing 1.5 - 1.7
 * Program demonstrates CountDownApp using threading classes
 * Scheduled - Schedule a run of code for some future time
 * ThreadPool - Creates several threads (a pool) at the same time. Grab whatever thread is available when running code and use that thread
 * Executor - Executes code
 * 
 * @author Neo
 */
class P489_CountDownAppNew {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool
                = new ScheduledThreadPoolExecutor(25);
        Runnable flood, ignition, liftoff;
        flood = new LaunchEventNew("Flood the pad!");
        ignition = new LaunchEventNew("Start engines!");
        liftoff = new LaunchEventNew("Liftoff!");
        for (int t = 20; t >= 0; t--) {                                         //for loop spans 20 threads
            pool.schedule(new CountDownClockNew(t),                                 
                    (long) (20 - t), TimeUnit.SECONDS);                         //(long)(20-t) - tells Java to wait x amount of seconds before 
        }                                                                       //running T minus x thread
        pool.schedule(flood, 3L, TimeUnit.SECONDS);
        pool.schedule(ignition, 13L, TimeUnit.SECONDS);
        pool.schedule(liftoff, 19L, TimeUnit.SECONDS);
        pool.shutdown();
    }
}
    public class CountDownClockNew implements Runnable {

        int t;

        public CountDownClockNew(int t) {
            this.t = t;
        }

        @Override
        public void run() {
            System.out.println("T minus " + t);
        }

        public class LaunchEventNew implements Runnable {

            private String message;

            public LaunchEventNew(String message) {
                this.message = message;
            }

            @Override
            public void run() {
                System.out.println(message);
            }

        }
    }


