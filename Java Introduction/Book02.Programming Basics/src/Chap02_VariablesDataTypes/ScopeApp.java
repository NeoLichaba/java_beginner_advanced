
/* Listing 2_1 */
package Chap02_VariablesDataTypes;

/* Program demonstrates Scope of Class and Local Variables; 
 * Program sets out to define scope - parts of a class that a variable exists;
 * Scope of local variable begins when variable is declared and initialized, ends
   when block containing variable declaration ends;
 */
public class ScopeApp {

    //class variable accessible by main and myMethod methods
    static int x;                                      

    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }

    public static void myMethod() { //void doesn't return a value
        //y is a local variable - can be accessed only in this code block
        int y;
        y = 10;
        if (y == x + 5) {
        
        //z is a local variable - can be accessed only in this code block
            int z;
            z = 15;
            System.out.println("myMethod: z = " + z);
        }
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }
}
