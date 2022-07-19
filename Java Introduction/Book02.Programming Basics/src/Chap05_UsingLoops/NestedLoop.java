package Chap05_UsingLoops;

/* Program demonstrates nested loop - loop within a loop
 */
public class NestedLoop {

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {                         //outer loop
            for (int y = 1; y < 10; y++) {                     //inner loop
                System.out.print(x + "-" + y + " ");
            }
            System.out.println();
        }
    }
}
