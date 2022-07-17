
/* Listing 3_2 
 * Using constants of the Math Class
*/

package Chap03_NumbersAndExpressions;

/* Use of constant PI to calculate area of the circle based on user input*/

import java.util.Scanner;

public class CircleAreaApp
{
    static Scanner sc = new Scanner(System.in);                 //Object created and user input stored
    public static void main(String[] args)
    {
        System.out.println(
            "Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");  //user requested to input a number, printed on console
        double r = sc.nextDouble();                             //reads double value entered by user
        double area = Math.PI * (r * r);                        //area of circle calculated
        System.out.println("The area is " + area);
    }
}
