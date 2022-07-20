
package Chap07_Methods;

/* Programs aims to display benefits of methods that accept parameters
*/

import java.util.Scanner;

public class GuessingGameMethod3
{

   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args)
   {
      System.out.println("Let�s play a guessing game!");
      do
      {
          playARound(1, getRandomNumber(7, 12));                        //playAround calls to play a round of the game
                                                                        //min value =1, maximum value is a random number generated from 7 and 12
      } while (askForAnotherRound("Try again?"));
      System.out.println("\nThank you for playing!");
   }
   public static void playARound(int min, int max)                      //method doesn't return a value, two arguments
   {
      boolean validInput;
      int number, guess;
      String answer;

      // Pick a random number - range for the random numbers is set
      number = getRandomNumber(min, max);	
      // Get the guess - computer communicates random numbers chosen within a particular range (min and max)
      System.out.println("\nI�m thinking of a number "
          + "between " + min + " and " + max + ".");	
      System.out.print("What do you think it is? ");
      guess = getGuess(min, max);                                       //call to getGuess method, passes range of acceptable guesses

      // Check the guess
      if (guess == number)
          System.out.println("You�re right!");
      else
          System.out.println("You�re wrong!"
              + " The number was " + number);
   }
   public static int getRandomNumber(int min, int max)                      //method returns number between min and max passed into parameters
   {
      return (int)(Math.random()	
          * (max - min + 1)) + min;
   }
   public static int getGuess(int min, int max)                             //method accepts two parameters, limits user
   {
      while (true)
      {
          int guess = sc.nextInt();
          if ( (guess < min) || (guess > max) )                             //conditions to be met within the min and max ranges
          {
              System.out.print("I said, between "
                  + min + " and " + max
                  + ". Try again: ");
          }
          else
              return guess;                                                 //returns if parameters are met	
      }
   }
   public static boolean askForAnotherRound(String prompt)                      //returns boolean value to indicate whether user wants to continue playing; String value is the parameter	
   {
      while (true)
      {
          String answer;
          System.out.print("\n" + prompt + " (Y or N) ");
          answer = sc.next();
          if (answer.equalsIgnoreCase("Y"))
              return true;
          else if (answer.equalsIgnoreCase("N"))
              return false;
      }
   }
}
