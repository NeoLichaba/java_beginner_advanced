
package Chap08_HandlingExceptions;

/* Program makes use of a while loop in order to avoid an exception 
 */

import java.util.*;

public class GetInteger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();                                     //i variable is an integer and values are derived from GetAnInteger method
        System.out.println("You entered " + i);
    }

    public static int GetAnInteger() {
        while (!sc.hasNextInt()) {                                  //conditional expression calls hasNextInt method from Scanner class
                                                                    //assessing whether next value is an integer
            sc.nextLine();                                          //nextLine method called to discard bad data
            System.out.print("That's not "                          //error message displayed and prompts user to try again
                    + "an integer. Try again: ");
        }
        return sc.nextInt();                                        //ends at this return statement. nextInt called to parse data into an integer and return value
    }
}
