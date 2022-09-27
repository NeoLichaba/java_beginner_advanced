package Chap01_ProgrammingThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* Listing 1.8
 * Resulting output is an unpredictable mishmash of 2 threads outputs with duplicates or some counts skipped altogether
 * 2 threads execute their loops simultaneously
 */
public class P492_DoTwoThings {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock(20);

    public static void main(String[] args) {
        new P492_DoTwoThings();
    }

    P492_DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }

}
