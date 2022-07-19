
package Chap05_UsingLoops;

/* This program demonstrates using the continue statement vs. break statment
 */
public class Dodecaphobia3 {

    public static void main(String[] args) {
        int number = 0;                                 //value of number initialised to 0
        while (number < 20) {                           //infinite loop
            number += 2;                                //2 added to the previous number and enters into if statement
            if (number == 12) {                         //if statement executed - once the number 12 is reached 
                continue;                               //breaks and sends controls back to the top of the loop to be evaluated again
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
