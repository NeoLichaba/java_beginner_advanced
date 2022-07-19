
package Chap05_UsingLoops;

/* Program makes use of a bodiless for loop
 * Recommended to rather keep the expressions simple 
 */

public class ExpressionGanging {

    public static void main(String[] args) {
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >= 0;
                System.out.println((count == 8)                         //count expression makes use of ternary operator
                        ? "Ignition sequence start!"
                        : count + "..."), count--);
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
    }
}
