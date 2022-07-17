
/* Listing 3_1 
 * Program calculates the number of marbles given to each child and the number of marbles remaining
 * Remainder operator is called the modulus operator
 */

package Chap03_NumbersAndExpressions;

import java.util.Scanner;

public class MarblesApp
{
    static Scanner sc = new Scanner(System.in);	
    public static void main(String[] args)
    {
        // declarations	
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        // get the input data	
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();

        // calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;	
        marblesLeftOver = numberOfMarbles % numberOfChildren;	

        // print the results	
        System.out.println("Give each child " +
            marblesPerChild + " marbles.");
        System.out.println("You will have " +
            marblesLeftOver + " marbles left over.");
    }

}
