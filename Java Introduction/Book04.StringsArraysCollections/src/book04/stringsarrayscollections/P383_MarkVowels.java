package book04.stringsarrayscollections;

import java.util.Scanner;

/* Program displays use of substring method to replace all the vowels in a string entered by the user with *
 *
 *
 */
public class P383_MarkVowels {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String originalString = s;
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {                                  //for loop and charAt method extracts each character from the string
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                String front = s.substring(0, i);                               //string named front is created that consists of all the characters that appear before the vowel
                String back = s.substring(i + 1);                               //string named back is created that consists of all the characters that appear after the vowel
                s = front + "*" + back;                                         //s string is replaced by a new string constructred from front, * and back string
            }
        }
        System.out.println();
        System.out.println(originalString);
        System.out.println(s);
    }
}
