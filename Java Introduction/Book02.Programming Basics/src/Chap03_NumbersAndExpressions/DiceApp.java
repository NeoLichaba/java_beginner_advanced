/*
 * Listing 3_4
 */
package Chap03_NumbersAndExpressions;

/* Program sets out to show how random-number calculation works
 * 100 different sequences displayed 
 * 
 */
public class DiceApp {

    public static void main(String[] args) {
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i = 0; i < 100; i++) {                     //for loop used
            roll = randomInt(1, 6);                         //randomInt method is called with ranges 1-6 defined, number assigned to roll variable
            System.out.print(roll + " ");                   //random numbers printed on same line
        }
        System.out.println();
    }

    public static int randomInt(int low, int high) {        //randomInt method return an int value with 2 arguments - low and high
        int result = (int) (Math.random()
                * (high - low + 1)) + low;                  //random number includes 1 but excludes 6;
        return result;                                      //random number returned to statement that called the randomInt method
    }
}


