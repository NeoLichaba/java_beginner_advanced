/*
 * Listing 2_1
 */
package Chap02_VariablesDataTypes;

/* Program consists of a class that demonstrates shadowing
 * 
 * 
 */
public class ShadowApp
{		
    static int x;	//class variable
    public static void main(String[] args)
    {
        x = 5;         //class variable assigned a value of 5
        System.out.println("x = " + x); //output: x =5;
        int x;	//local variable in scope
        x = 10;	//value assigned to local variable
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " +
            ShadowApp.x); //class variable name is specified allowing for access
    }	//class variable no longer shadowed
}		

