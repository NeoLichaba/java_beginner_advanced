package Chap01_WorkingWithStrings;

import java.util.Scanner;

/* Use of StringBuilder class
 *
 *
 */
public class P390_StringBuilderApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);                                               //returns characters at the specified position
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                sb.setCharAt(i, '*');                                           //sets characters at position i with an asterix
            }
        }
        System.out.println();
        System.out.println(s);                                                  //returns string s
        System.out.println(sb.toString());                                      //returns current value as a string
    }

}
