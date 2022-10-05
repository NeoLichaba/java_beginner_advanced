
package Chap05_UsingLoops;

/*
 * Program uses a while loop to print even numbers from 2 to 20 on the console 
 * 
 */
public class EvenCounter {

    public static void main(String[] args) {
        int number = 2;                         //number variable is declared and instantiated with the number 2;
        while (number <= 20) {                  //for as long as the value of the number is less than 20, an even number will continue to be printed out
            System.out.print(number + " ");
            number += 2;                        //previous number increments by 2. Example of a compound operator
        }
        System.out.println();
    }
}

