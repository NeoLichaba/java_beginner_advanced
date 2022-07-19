package Chap05_UsingLoops;

/* Program demonstrates initialisation and count expressions as a list
 * This program displays tracking two counter variables 
 */
public class CountBothWays {

    public static void main(String[] args) {
        int a, b;                                           //two counter variables declared
        for (a = 1, b = 10; a <= 10; a++, b--) {            //two counter variables initialised with values (starting point);
                                                            //a increments, b decrements
            System.out.println(a + " " + b);                //values printed as loop executed until conditions met
        }
    }
}
