
package Chap06_Switcheroos;

import java.util.Scanner;

/* In this program, string codes are evaluated as opposed to using letters/characters*/

public class CarWashStringApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("The car wash application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();

        String details = "";

        switch (s.toUpperCase())                                                //user input converted to uppercase before being tested against string constants
        {
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus . . . \n";
            case "ELITE":
                details += "\tTire Treatment, plus . . . \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus . . . \n";
            case "SUPER":
                details += "\tWax, plus . . . \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
