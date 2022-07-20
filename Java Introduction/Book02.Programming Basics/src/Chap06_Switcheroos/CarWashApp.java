package Chap06_Switcheroos;

import java.util.Scanner;

/* Program displays all products that you get when you select a specific package
*  No break statement in this application
*/

public class CarWashApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();                                               //next method takes in a string
        char p = s.charAt(0);                                               //char value at the given index number returned

        String details = "";

        switch (p) {
            case 'E':
            case 'e':
                details += "\tNew Car Scent, plus . . . \n";
            case 'D':
            case 'd':
                details += "\tTyre Treatment, plus . . . \n";
            case 'C':
            case 'c':
                details += "\tLeather/Vinyl Treatment, plus . . . \n";
            case 'B':
            case 'b':
                details += "\tWax, plus . . . \n";
            case 'A':
            case 'a':
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:                                                            //executed if none of the other case constants didn't match
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
