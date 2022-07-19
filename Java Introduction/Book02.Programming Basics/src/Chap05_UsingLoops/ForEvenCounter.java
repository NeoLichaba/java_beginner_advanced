package Chap05_UsingLoops;

/* Program demonstrates counting even numbers up to 20 using a for loop
 * Counter expression modified
 * 
 */
public class ForEvenCounter {

    public static void main(String[] args) {
        for (int number = 2; number <= 20; number += 2) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
