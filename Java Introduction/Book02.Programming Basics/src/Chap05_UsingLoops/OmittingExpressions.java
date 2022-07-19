/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap05_UsingLoops;

import java.util.Scanner;

/* Program demonstrates omitting expressions
 * Program counts back from user input to 0
 * Input semi-colon as a placeholder so compiler knows what's going on
 * 
 */
public class OmittingExpressions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where should I start? ");
        int a = sc.nextInt();                                   //scanner class method 
        for (; a >= 0; a--) {                                   //initialization expression omitted
            System.out.println(a);
        }
    }
}
