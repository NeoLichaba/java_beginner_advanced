package Chap03_UsingRecursion;

/* Program uses for loop in order to demonstrate factorials 
 * NumberFormat class can be used in order to format the result
 * @author User
 */
public class P524_NonRecursive {

    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {                                          //for loop counts from 1 to the number
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
        long fact;                                                              //use a long rather than an int as it can get big
        fact = factorial(n);
        System.out.println("The factorial of " + n + " is "
                + fact + ".");
    }
}
