
package Chap01_ProgrammingThreads;



/* Program makes use of the 
 *
 * @author User
 */

import java.util.ArrayList;

public class P483_CountDownApp {
  public static void main(String[] args)
   {
      Thread clock = new P479_CountDownClock();                                 //instance of CountDownClock created
      Runnable flood, ignition, liftoff;                                        //LaunchEvent objects created and assigned to variable of type Runnable
      flood = new P482_LaunchEvent(16, "Flood the pad!");
      ignition = new P482_LaunchEvent(6, "Start engines!");
      liftoff = new P482_LaunchEvent(0, "Liftoff!");
      clock.start();                                                            //countdown begins
      new Thread(flood).start();                                                //LaunchEvent objects started
      new Thread(ignition).start();                                             //creates a new instance of Thread class, passing LaunchEvent objects to Thread constructor, then calls start method
      new Thread(liftoff).start();
      
       /*Thread clock = new CountDownClock();
         ArrayList<Runnable> events                                             //ArrayList used in order to store Runnable objecys
         = new ArrayList<Runnable>();
         events.add(new P482_LaunchEvent(16, "Flood the pad!"));
         events.add(new P482_LaunchEvent(6, "Start engines!"));
         events.add(new P482_LaunchEvent(0, "Liftoff!"));
         clock.start();
         for (Runnable e : events)                                              //iterates using an enhanced for loop
         new Thread(e).start();*/
      
   }
  
}
