package Chap05_UsingLoops;

/* Program demonstrates counting backwards through adjust for loop expressions 
 */
public class CountDown {

    public static void main(String[] args) {
        for (int count = 10; count >= 1; count--) {                 //starting value specified in initialisation expression, 
                                                                    //test expression uses >= instead of =<
                                                                    //count variable decrements 
            System.out.println(count);                              //count variable called and printed out
        }
    }
}
