package Chap01_WorkingWithStrings;

import java.util.Scanner;

/* Program aims to demonstrate split method, making use of regular expression \\s+
 * \\s+ pattern treats any consecutive white-space character as a single delimeter when splitting words
 * 
 */
public class P385_ListWords {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] word = s.split("\\s+");                                        //split method requires one to use an array. string s is split making use of the \\s+ pattern; returns array of strings                                       
        for (String w : word) {                                                 //enhanced loop loops through elements of array - word (String with variable name w, loops through array with name word)   
            System.out.println(w);                                              //print out variable w
        }
    }
}
