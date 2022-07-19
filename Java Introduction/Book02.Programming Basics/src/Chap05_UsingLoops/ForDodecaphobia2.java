package Chap05_UsingLoops;

/* Program demonstrates the use of the continue statement 12 rather than abort
 */

public class ForDodecaphobia2 {

    public static void main(String[] args) {
        for (int number = 2; number <= 20; number += 2) {
            if (number == 12) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
