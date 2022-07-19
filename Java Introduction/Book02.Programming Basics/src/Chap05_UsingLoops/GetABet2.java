package Chap05_UsingLoops;

import java.util.Scanner;

/* Program allows user to bet any amount he wants but not more than what he has in the bank
 */

public class GetABet2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;                                // assume the user has $1,000
        int bet;                                        // the bet entered by the user
        System.out.println("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            if ((bet <= 0) || (bet > bank)) {           //if statement used to evaluate whether user input valid;
                                                        //Bet placed can't be negative or 0 or more than what is held in the account
                System.out.println("What, are you crazy?"); //Message displayed if user input invalid
            }
         } while ((bet <= 0) || (bet > bank));          //If conditions are met - Bet placed can't be negative or 0 or more than what is held in the account
        System.out.println("Your money's good here.");  //Message printed in console
    }
}
