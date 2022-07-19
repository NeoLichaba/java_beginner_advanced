package Chap05_UsingLoops;

import java.util.Scanner;

/* Program allows user to bet any amount he wants but not more than what he has in the bank
 * Program makes use of do-while loop to obtain this input 
 * Do-while loop validates user input
 */
public class GetABet {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;                                    // assume the user has $1,000
        int bet;                                            // the bet entered by the user
        System.out.println("You can bet between 1 and "
                + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();                             //scanner class method used to evaluate input values (int) and execute;No parameters required
        } while ((bet <= 0) || (bet > bank));               //do-while condition is met so long as one of the conditions on either side of the Or operator are met
                                                            //bet can't be negative or 0 and it can't be more than that held in one's account
        System.out.println("Your money's good here.");
    }
}
