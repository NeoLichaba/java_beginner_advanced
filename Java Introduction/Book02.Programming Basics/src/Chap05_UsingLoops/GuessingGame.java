package Chap05_UsingLoops;

import java.util.Scanner;

/* Program seeks to demonstrate a nested loop by implementing a guessing game
 */
public class GuessingGame {

    static Scanner sc = new Scanner(System.in);                             

    public static void main(String[] args) {
        boolean keepPlaying = true;                                         //boolean defined and initialised to true and changes to false when user indicates wanting to stop playing
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {                                               //infinite loop begins, reading user input
            boolean validInput;                                             //boolean variable declared used to validate user input
            int number, guess;                                              //variable declaration
            String answer;                                                  //variable declared
            // Pick a random number
            number = (int) (Math.random() * 10) + 1;                        //cast to number variable to integer; MathRandom function used as a base of 10
            // Get the guess
            System.out.println("\nI'm thinking of a number "
                    + "between 1 and 10.");
            System.out.print("What do you think it is? ");
            do {                                                            //do while loop begins
                guess = sc.nextInt();                                       //guess data obtained and tests validity
                validInput = true;                                          //if valid, input set to true
                if ((guess < 1) || (guess > 10)) {                          //users guess compared to computer generated number
                    System.out.print("I said, between 1 and 10. "           //for invalid input, prints out error statement
                            + "Try again: ");
                    validInput = false;                                     //
                }
            } while (!validInput);                                              
            // Check the guess
            if (guess == number) {
                System.out.println("You�re right!");
            } else {
                System.out.println("You're wrong! "
                        + "The number was " + number);
            }
            // Play again?
            do {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;                                
                } else {
                    validInput = false;                             //validInput set to false if user no longer wanting to play
                }
            } while (!validInput);                                  
        }
        System.out.println("\nThank you for playing!");
    }
}
