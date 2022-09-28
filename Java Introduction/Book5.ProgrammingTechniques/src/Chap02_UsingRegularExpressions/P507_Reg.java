package Chap02_UsingRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;                                                 //helping in performing matching operations on String using patterns        
import java.util.regex.Pattern;                                                 //helps in defining patterns

/* Program demonstrates the user input in character/String format
 *
 * @author Neo
 */
public final class P507_Reg {

    static String r, s;
    static Pattern pattern;                                                     //                             
    static Matcher matcher;                                                     //matcher created for matching pattern with String inputted by User
    static boolean match, validRegex, doneMatching;
    private static Scanner sc
            = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");                            //program prompts user to enter a regular expression
                r = sc.nextLine();
                validRegex = true;
                try {
                    pattern = Pattern.compile(r);                               //it will test to see if a valid regular expression
                                                                                //compile method used to create a pattern object
                                                                                //compile method throws PatternSyntaxException so ensure to use try/catch statement 
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");                             //user prompted to enter string
                s = sc.nextLine();
                if (s.length() == 0) {
                    doneMatching = true;
                } else {
                    matcher = pattern.matcher(s);                               //instance of Matcher class created after Pattern instance
                    if (matcher.matches()) {
                        System.out.println("Match.");
                    } else {
                        System.out.println(
                                "Does not match.");
                    }
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
