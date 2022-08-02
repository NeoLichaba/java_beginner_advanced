
package Chap02_Classes;

/* Program displays how one can call other constructors
 * 
 * 
 */
public class Actor {

    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }
    
    /* Constructor calls on the above constructor using "this" keyword
     * lastName and firstName set; goodActor field set
     * Can only call first statement
    */
    public Actor(String last, String first, boolean good) {
        this(last, first);
        goodActor = good;
    }
}
