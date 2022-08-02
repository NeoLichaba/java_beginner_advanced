package Chap02_Classes;

/* Using Getters and Setters
 * Hide implementation details of a class whilst controlling what aspects of the class are exposed
 * Selectively grant access to the data through accessors 
 *
 */
public class Player {

    //private field can only be accessed through getter and setter methods
    private int health;

    //Get accessor: Retrieves field value
    public int getHealth() {
        return health;
    }

    //Get accessor: Sets field value
    public void setHealth(int h) {
        health = h;
    }
    
    /* Protect the class from bad data by validating data in a property set acessor
     * setHealth method is called with a value less than 0, health is set 
       to 0. Likewise, if the value is greater than 100, health is set to 100
    */
//    public void setHealth(int h) {
//        if (h < 0) {
//            health = 0;
//        } else if (h > 100) {
//            health = 100;
//        } else {
//            health = h;
//        }
    }

