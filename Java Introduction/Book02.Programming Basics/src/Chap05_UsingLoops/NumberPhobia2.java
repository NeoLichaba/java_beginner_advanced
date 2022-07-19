
package Chap05_UsingLoops;

import java.util.Scanner;

/* Program sets to give user an option to opt out by testing the input string to while condition
 *
 * 
 */
public class NumberPhobia2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 2;                                         //starting point declared and initialised
        String input = "Y";                                     //input string initialised to the value that continues the loop. Won't execute it not
        while (input.equalsIgnoreCase("Y")) {
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();
            number += 2;                                        
        }
        System.out.println("\nWhew! That was close.");
    }

}
