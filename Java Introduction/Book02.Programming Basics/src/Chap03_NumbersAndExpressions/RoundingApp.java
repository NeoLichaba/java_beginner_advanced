/*
 * Listing 3_5
 */
package Chap03_NumbersAndExpressions;

/* Reveals rounding functions provided by the maths class
 *
 *
 */
    public class RoundingApp {

        public static void main(String[] args) {
            double x = 29.4;
            double y = 93.5;
            double z = -19.3;
            
            //returns integer closes to the number
            
            System.out.println("round(x) = " + Math.round(x));
            System.out.println("round(y) = " + Math.round(y));
            System.out.println("round(z) = " + Math.round(z));
            System.out.println();
            
            //returns smallest value in integer form but greater than argument
            
            System.out.println("ceil(x) = " + Math.ceil(x));
            System.out.println("ceil(y) = " + Math.ceil(y));
            System.out.println("ceil(z) = " + Math.ceil(z));
            System.out.println();
            
            //returns largest value in integer form that is less than argument
            
            System.out.println("floor(x) = " + Math.floor(x));
            System.out.println("floor(y) = " + Math.floor(y));
            System.out.println("floor(z) = " + Math.floor(z));
            System.out.println();
            
            //returns a double value that is an integer
            
            System.out.println("rint(x) = " + Math.rint(x));
            System.out.println("rint(y) = " + Math.rint(y));
            System.out.println("rint(z) = " + Math.rint(z));
        }
    }
