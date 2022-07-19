/*
 * 
 */
package Chap05_UsingLoops;

/*
 * Program contains loop with an escape clause - break statement
 * 
 */
public class Dodecaphobia {

    public static void main(String[] args) {
        int number = 2;                                             //number variable initialised to 2;
        while (number <= 20) {
            if (number == 12) {                                     //when the integer reaches the number 12
                break;                                              //exit the loop
            }
            System.out.print(number + " ");                         //number is printed in console
            number += 2;                                            //increment the previous number printed by 2
        }
        System.out.println();
    }

}
