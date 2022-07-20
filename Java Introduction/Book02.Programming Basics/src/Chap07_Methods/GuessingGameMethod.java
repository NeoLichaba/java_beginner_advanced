
package Chap07_Methods;

import java.util.Scanner;

/* Program seeks to simplify the Guessing Game through placing the body of the main method in a separate method
 * Invoked in the playAround method
*/

public class GuessingGameMethod
{
   static Scanner sc = new Scanner(System.in);
   static boolean keepPlaying = true;                                           //keepPlaying variable created as a class variable (using keyword static) so accessible by main and playAround method(s)
   public static void main(String[] args)
   {
      System.out.println("Let�s play a guessing game!");

      while (keepPlaying)                                                       	
      {
          playARound();                                                         //while loop repeats, program plays one round with user
      }
      System.out.println("\nThank you for playing!");
   }
   public static void playARound()                                              //static method so it can be called on by the main method	
   {
      boolean validInput;
      int number, guess;
      String answer;

      // Pick a random number
      number = (int)(Math.random() * 10) + 1;
      System.out.println("\nI�m thinking of a number "
          + "between 1 and 10.");

      // Get the guess
      System.out.print("What do you think it is? ");
      do
      {
          guess = sc.nextInt();
          validInput = true;
          if ((guess < 1) || (guess > 10))
          {
              System.out.print("I said, between 1 "
                  + "and 10. Try again: ");
              validInput = false;
          }
      } while (!validInput);

      // Check the guess
      if (guess == number)
          System.out.println("You�re right!");
      else
          System.out.println("You�re wrong!"
              + " The number was " + number);
      // Play again?
      do
      {
          System.out.print("\nPlay again? (Y or N)");
          answer = sc.next();
          validInput = true;
          if (answer.equalsIgnoreCase("Y"));
          else if (answer.equalsIgnoreCase("N"))
              keepPlaying = false;	
          else
              validInput = false;
      } while (!validInput);
   }
}
