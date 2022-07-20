
package Chap08_HandlingExceptions;

/* Program is a simple example of a program that uses a method to get a valid integer from the user
 */
import java.util.*;

public class GetInteger
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();                                         //i variable is an integer and values are derived from GetAnInteger method
        System.out.println("You entered " + i);
    }
    public static int GetAnInteger()                                    //method declared accepting int values
    {
        while (true)                                                    //while loop with true expression is used - infinite loop
        {
            try                                                        
            {
                return sc.nextInt();                                    //return input from user should it be valid. Has to be able to be converted into an integer
            }
            catch (InputMismatchException e)                            //catch block used to catch the error, throwing the exception and forces the loop to repeat
                                                                        //incorrect input discarded
            {
                sc.next();                                              //next method called - must be called in catch block. Without, while loop is infinite
                System.out.print("That's not "                          //error message displayed and while loop repeats
                    + "an integer. Try again: ");
            }
        }
    }
}

