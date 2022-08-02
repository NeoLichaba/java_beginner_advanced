package Chap02_Classes;

/* Program demonstrates outline of classes
 * Two public classes in the same file can't be placed
 */
public class DiceGame {

    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll();
    }
}

/*Program will compile if public keyword removed from Dice class
 * Inner class - classs defined within a body of another class; available only within that class
 */
/*public*/

class Dice {

    public void roll() {
        // code that rolls the dice goes here
    }
}
