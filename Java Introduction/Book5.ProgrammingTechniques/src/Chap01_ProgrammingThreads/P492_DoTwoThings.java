package Chap01_ProgrammingThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* Listing 1.8
 * Resulting output is an unpredictable mishmash of 2 threads outputs with duplicates or some counts skipped altogether
 * 2 threads execute their loops simultaneously
 * Scheduled - Schedule a run of code for some future time
 * ThreadPool - Creates several threads (a pool) at the same time. Grab whatever thread is available when running code and use that thread
 * Executor - Executes code
 *
 */
public class P492_DoTwoThings {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);                               //instance of STP pool created with 2 (pool size) 
    CountDownClock clock = new CountDownClock(20);                              //Instance of CountDownClock created

    public static void main(String[] args) {
        new P492_DoTwoThings();
    }

    P492_DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }

}
