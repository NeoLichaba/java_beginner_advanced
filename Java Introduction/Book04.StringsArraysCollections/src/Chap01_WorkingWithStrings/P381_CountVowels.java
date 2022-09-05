package Chap01_WorkingWithStrings;

import java.util.Scanner;

/* Program displays use of chatAt method to count the number of vowels in a string entered by a user
 *
 * 
 */
public class P381_CountVowels {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();                                               //nextLine method reads input up to the end of the line
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {                                  //for loop checks the length of the string, ensuring variable i doesn't exceed the length
            char c = s.charAt(i);                                               //Returns character at specific position in the string
            if ((c == 'A') || (c == 'a')                                        //if statement checks for the vowels in both upper and lower case
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                vowelCount++;                                                   //vowelCount variable increments as the condition is met
            }
        }
        System.out.println("That string contains "
                + vowelCount + " vowels.");
    }
}
