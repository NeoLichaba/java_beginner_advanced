
package Chap05_UsingLoops;

import java.util.Scanner;

/*
 * Program allows for user to stop the loop through Scanner class
 * 
 */
public class NumberPhobia {

    static Scanner sc = new Scanner(System.in);                     //Scanner construct created

    public static void main(String[] args) {
        int number = 2;                                             
        String input;                                               //input type declared as a String
        while (true) {                                              //infinite loop activated
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();                                      //input variable instantiated to hold object values and move onto the next code to execute
            if (input.equalsIgnoreCase("N")) {                      //String input value compared and case ignored
                break;                                              //break out of if statement once condition is met
            }
            number += 2;                                            //previous number incremented by 2
        }
        System.out.println("\nWhew! That was close.\n");
    }
}

