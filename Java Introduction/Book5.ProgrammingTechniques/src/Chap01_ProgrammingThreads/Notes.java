
package Chap01_ProgrammingThreads;

/* Threads let you divide the work of an application into separate pieces - run simultaneously
 * Used to solve difficult programming problems

 -- Understanding Threads
    - Thread - single sequence of executable code within a larger program
    - Examples of programs that use threads to perform several tasks:
        - Web browsers
        - Email programs
        - Word Processors
        - Games
     -- Understanding the Thread Class
        - Let's you create an object that can be run as a thread in a mulitthreaded Java app
        - Refer to examples CountDownApp and CountDownClock
     
  -- Implementing the Runnable Interface
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