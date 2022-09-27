
package Chap01_ProgrammingThreads;

/* Threads let you divide the work of an application into separate pieces - run simultaneously
 * Used to solve difficult programming problems

 -- Understanding Threads (refer to CountDownClock and CountDownApp)
    - Thread - single sequence of executable code within a larger program
    - Examples of programs that use threads to perform several tasks:
        - Web browsers
        - Email programs
        - Word Processors
        - Games
     -- Understanding the Thread Class
        - Let's you create an object that can be run as a thread in a mulitthreaded Java app
        - Refer to examples CountDownApp and CountDownClock
     
  -- Implementing the Runnable Interface (refer to LaunchEvent - CountDownAppNew examples)
    - Runnable interface uses another technique for creating and starting threads - more code but more flexible
    - Allows for thread to extend another class
    - Marks an object that can be run as a thread
    - Only has one method - run()
    - Using the Runnable Interface
      1. Create a class that implements Runnable
      2. Provide a run method in the class you created
      3. Create an instance of the Thread class and pass Runnable object to constructor as a parameter
      4. Call the Thread object's start method
        - run method of Runnable object is called and executes in a separate thread
        - example 1: RunnableClass rc = new RunnableClass();
                     Thread t = new Thread(rc);
                     t.start();
        - example 2: Thread t = new Thread(new RunnableClass());
                     t.start()
        - example 3: new Thread(new RunnableClass()).start();

    -- Synchronizing Methods (refer to DoTwoThings examples)
     - Need to consider concurrency when running multiple threads
     - Concurrency - when 2 threads try to access the same methods, at the same time
     - The key to handling concurrency issues is recognizing methods that update data 
       and that might be called by more than one thread. 
     - Once these are identified, add "synchronized" to the method declaration (i.e. public synchronized void method()...)
     - This tells Java to put a lock on the object so that no other methods can call any other synchronized method for the object
       until it's finished (i.e. multithreading temporarily disabled)
     - Knowing which method to synchronize is the tough part - instance variables are at risk of being updated due to there being a common copy of the instance variables
     - Unable to synchronize all methods:
       1) Java has to acquire a lock on object beinf synchronized, run the method, release the lock. Has to check
          if another thread doesn't have a lock on the object.
       2) Defeats the purpose of multithreading
     - Object class provides 3 methods that can let sychronized objects coordinate their activities:
        $ - The wait method puts a thread in the waiting state until 
            some other thread calls either the object’s notify or (more commonly) notifyAll
            method. Eg. banking system

    -- Creating a Lock (refer to DoTwoThingsLocked example)
    -- Coping with Threadus Interruptus
       
     - A thread can be interrupted by calling an interrupt method
     - InterruptedException is thrown when another thread calls the interrupt method on the thread whilst it is not executing
     - The methods that can give up control to another thread thtow this exception. Thread will resume execution and you will know which one it was
     - yield and sleep are other ways in which control can be wrested from a thread - can be merely interuppted by thread scheduler
     - If it occurs, InterruptedException isn't thrown, instead interupptes flag is set to indicate the thread was interrupted 
     - You can test the status of this flag by calling the static interrupted method
     - Threads are to check twice to see whether they have been interrupted. 
        public void run()
        {
        boolean done = false
        boolean abort = false;
        while(!done)
        {
            // do the thread_s work here
            // set done to true when finished
        try
            {
        sleep(100); // sleep a bit
        }
        catch(InterruptedException e)
        {
            abort = true;                                                       //abort variable set to true if InterruptedException 
            }                                                                   // or if interrupted flag is set
            if (Thread.interrupted())           
            abort = true;                                                       //if abort set to true, break statement is executed    
            if (abort)
            break;
            }
           }



 

 * @author Neo
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
