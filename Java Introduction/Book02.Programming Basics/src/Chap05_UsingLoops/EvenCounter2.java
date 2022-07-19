
package Chap05_UsingLoops;

/*  Program demonstrates a do-while loop
 *  Code within do-while loop, executed at least once
 */
public class EvenCounter2 {

    public static void main(String[] args) {                
        int number = 2;
        do {                                                //do-while loop instantitated
            System.out.print(number + " ");                 //number printed out on console
            number += 2;                                    //incrementing by 2
        } while (number <= 20);                             //execute do-while loop until condition of the numbers being less than or equal to 20
        System.out.println();
    }
}
