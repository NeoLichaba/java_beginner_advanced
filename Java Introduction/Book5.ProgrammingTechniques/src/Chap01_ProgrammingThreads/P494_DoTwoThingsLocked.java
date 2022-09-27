package Chap01_ProgrammingThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* Listing 1.11 - 1.12
 *
 * @author User
 */
public class P494_DoTwoThingsLocked {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClockLocked clock
            = new CountDownClockLocked();

    public static void main(String[] args) {
        new P494_DoTwoThingsLocked();
    }

    P494_DoTwoThingsLocked() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }

    public class CountDownClockLocked extends Thread {

        ReentrantLock lock = new ReentrantLock();                               //variable lock instantiated as an object of ReentrantLock

        public void run() {
            lock.lock();                                                        //when lock.lock() is called, no other method can get past it
            for (int t = 20; t >= 0; t--) {
                System.out.println("T minus " + t);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            lock.unlock();                                                      //method is only available when thread reaches lock.unlock(), then second thread proceeds into method's for loop
        }

    }
}
