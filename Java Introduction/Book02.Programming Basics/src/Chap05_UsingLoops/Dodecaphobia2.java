
package Chap05_UsingLoops;

/**
 * Program demonstrates an infinite loop with a break statement
 *
 */
public class Dodecaphobia2 {

    public static void main(String[] args) {
        int number = 2;
        while (true) {                                          //infinite loop activated
            if (number == 12) {                                 //if statement with a condition that number will be met at 12
                break;                                          //break statement activated once if condition is met
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }

}
