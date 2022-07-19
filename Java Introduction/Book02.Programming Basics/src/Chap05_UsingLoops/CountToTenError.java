package Chap05_UsingLoops;

/* Program demonstrates scope of the counter variable
 * Compiler error ensues
 *
 */
public class CountToTenError {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println("The final value of i is "
                    + i);
        }
    }
}
