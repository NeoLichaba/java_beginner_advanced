
package Chap01_ProgrammingThreads;

/* Listing 1.1 
 * Program demonstrates countdown of a clock from 20 to 0
 * Class extends Thread class. Instance of this class is created and its start method called
 * @author User
 */
public class P479_CountDownClock extends Thread                                 
{
    @Override
    public void run()                                                           //Run method called when clock thread has been started
    {                                                                           //the run method will call sleep/yield at some point to allow for other threads to execute
        for (int t = 20; t >= 0; t--)                                           //for loop that counts down from 20 to 0
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);                                             //sleep method used to pause for 1 second
            }
            catch (InterruptedException e)                                      //sleep method throws exception hence need for try/catch statement that handles this exception
                                                                                //exception merely ignored if caught
            {}
        }
    }
}
