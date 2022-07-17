
/* Listing 2_3 */

package Chap02_VariablesDataTypes;

import java.util.Scanner;

/* Program uses the Scanner Class
 * Scanner class is used to obtain input from the user
 */
public class ScannerApp {    

    static Scanner sc = new Scanner(System.in); //Scanner variable and object created. Input stream required, standard keyboard
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: "); //user requested to insert data; printed out on the console
        int x = sc.nextInt();	//sc variable accessed and int value read from user
        System.out.println("You entered " + x + ".");
    }
}
