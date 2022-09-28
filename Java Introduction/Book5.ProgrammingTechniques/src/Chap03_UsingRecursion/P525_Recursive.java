package Chap03_UsingRecursion;

/* Recursive solution is based on factorial for any number n = to n times the factorial of n-1
 * Important part of recursive method is for it to have an end condition
 * End condition indicates when the recursive method should stop calling itself
 *
 * @author User
 */
public class P525_Recursive {

    private static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        long fact;                                                              //use a long rather than an int as it can get big
        fact = factorial(n);
        System.out.println("The factorial of " + n + " is "
                + fact + ".");
    }
}
