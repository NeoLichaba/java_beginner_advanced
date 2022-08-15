
package Chap05_AbstractClasses_Interfaces;

/* Interface is similar to an abstract class
 * Can include only abstract methods and final fields
 * Can't be used as a base class
 * Class can implement as many interfaces as needed
 * When naming classes, best to indicate some capability to a type of object
 * A class can inherit AND implement one or more interfaces
 * Can include final fields
 * Interface fields are assumed to be static, final and public
 * Superinterface - parent interface
 * Subinterface - child interface
 * Using interfaces: Create, implement, 
 * Page300
 */
public interface Playable {                                                     //interface is public and thus accessible 
                                                                                //by other classes
                                                                                // 1. Creating interface
        void play();
    


    public class TicTacToe implements Playable {                                // 2. Implementing interface
        // additional fields and methods go here

        public void play() {                                                    
            // implementation methods specified here
        }
        // additional fields and methods go here
    }
}
public class Hearts implements Playable, CardGame {                             //class can implement more than one interface
    // must implement methods of the Playable
    // and CardGame interfaces
}
