/*
 * Listing 3_3
 */
package Chap03_NumbersAndExpressions;

/*
 * Program demonstrates mathematical functions provided by the Math Class 
 */
public class MathFunctionsApp {

    public static void main(String[] args) {
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;
        double y = 3.0;
        double z = 4.0;
        System.out.println("abs(b) = " + Math.abs(b));          //absolute value of 100
        System.out.println("cbrt(x) = " + Math.cbrt(x));        //cube root of 25
        System.out.println("exp(y) = " + Math.exp(z));          //y raised to the power of 3
        System.out.println("hypot(y,z)= " + Math.hypot(y, z));  //hypotenuse /(square root of y squared + z squared)
        System.out.println("log(y) = " + Math.log(y));
        System.out.println("log10(y) = " + Math.log10(y));
        System.out.println("max(a, b) = " + Math.max(a, b));    //returns the maximum value of the 2 arguments
        System.out.println("min(a, b) = " + Math.min(a, b));    //returns the minimum value of the 2 arguments
        System.out.println("pow(a, c) = " + Math.pow(a, c));    //returns the value of the first argument raised to the power of the second argument.
        System.out.println("random() = " + Math.random());      //random number generated that is >= 0.0 but <1
        System.out.println("signum(b) = " + Math.signum(b));    //return sign of the argument, -1.0 = negative, 0 = zero; 1.0 = positive;
        System.out.println("sqrt(x) = " + Math.sqrt(y));        //square root
    }
}
