package Chap05_UsingLoops;

/*  Program demonstrates exiting for loop   
 */

public class ForDodecaphobia {

    public static void main(String[] args) {
        for (int number = 2; number <= 20; number += 2) {     //Version begins at 2, executing the for loop until the number reaches 20;
            if (number == 12) {                               //If program reaches 12, program aborted
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
