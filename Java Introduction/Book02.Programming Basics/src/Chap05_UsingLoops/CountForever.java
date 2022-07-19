
package Chap05_UsingLoops;

/*
 * 
 */
public class CountForever {

    public static void main(String[] args) {
        int number = 2;                                     //starting point declared and instantiated
        while (true) {                                      //infinite loop created by specifying "true" for the while expression
            System.out.print(number + " ");
            number += 2;                                    //previous number increments by 2
        }
    }
}
