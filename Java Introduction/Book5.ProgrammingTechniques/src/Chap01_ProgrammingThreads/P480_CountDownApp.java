
package Chap01_ProgrammingThreads;

/**
 *
 * @author Neo
 */
public class P480_CountDownApp
{
    public static void main(String[] args)
    {
        Thread clock = new P479_CountDownClock();                               //variable with type Thread declared and instance of CountDownClock created
        clock.start();                                                          //thread begins executing when start method called
    }
}

