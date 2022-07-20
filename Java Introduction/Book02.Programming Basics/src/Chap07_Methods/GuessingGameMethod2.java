
package Chap07_Methods;

import java.util.Scanner;

/* Guessing Game program that uses four methods in addition to main 
*/

public class GuessingGameMethod2
{
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args)
   {
      System.out.println("Let�s play a guessing game!");
      do                                                                //do while loop begins playing one round of game, stops when user indicates no longer wanting to play
      {
         playARound();                                                  //invokes playAround method to play one round
      } while (askForAnotherRound());                                   //invokes askForAnotherRound method determining whetheruser wants to play another round
      System.out.println("\nThank you for playing!");
   }

   public static void playARound()                                      //plays a round of the guessing game, doesn't return a value	
   {
      boolean validInput;
      int number, guess;
      String answer;

      // Pick a random number
      number = getRandomNumber();	

      // Get the guess - playAround method begins
      System.out.println("\nI�m thinking of a number "
         + "between 1 and 10.");
      System.out.print("What do you think it is? ");
      guess = getGuess();                                           //calls the getGuess method to obtain user's guess; guess stored in guess variable	
      
// Check the guess
      if (guess == number)
         System.out.println("You�re right!");
      else
         System.out.println("You�re wrong!"
            + " The number was " + number);
   }
   public static int getRandomNumber()                              //method returns a random number between 1 and 10
   {
      return (int)(Math.random() * 10) + 1;                         //returns a random number as value of the getRandomNumber method
   }
   public static int getGuess()                                     //obtains users guess
   {
      while (true)                                                  //infinite loop declared
      {
         int guess = sc.nextInt();                                  
         if ((guess < 1) || (guess > 10))                           //if statement and condition is met only when user enters a number between 1 and 10      
         {
            System.out.print("I said, between 1 and 10. "
                + "Try again: ");
         }
         else
            return guess;                                           //returns guess if within acceptable range, if not, return statement isn't executed
                                                                    //while loop will repeat
      }
   }

   public static boolean askForAnotherRound()                       //method askForAnotherRound returns a boolean value	
   {
      while (true)                                                  //while loop will only exit when user enters a valid answer
      {
         String answer;
         System.out.print("\nPlay again? (Y or N) ");
         answer = sc.next();
         if (answer.equalsIgnoreCase("Y"))

            return true;	
         else if (answer.equalsIgnoreCase("N"))
            return false;	
      }
   }
}
