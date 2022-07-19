package Chap05_UsingLoops;

import java.util.Scanner;

/* Program sets out to demonstrate do-while loop using a boolean variable 
 */
public class GetABet3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;                                        // assume the user has $1,000
        int bet;                                                // the bet entered by the user
        boolean validBet;                                       // indicates if bet is valid
        System.out.println("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();                                 //user input evaluated and executed
            validBet = true;                                    //variable set 
            if ((bet <= 0) || (bet > bank)) {
                validBet = false;                               //boolean variable placed within if statement.
                                                                //if condition of if statement are not met, variable validBet set to false
                System.out.println("What, are you crazy?");     //message printed in console based on invalid user input
            }
        } while (!validBet);                                    //while loop reads previous entry with current and converts to true
        System.out.println("Your money's good here.");          
    }
}
