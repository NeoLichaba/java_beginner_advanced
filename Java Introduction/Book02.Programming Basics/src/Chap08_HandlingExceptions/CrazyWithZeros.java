package Chap08_HandlingExceptions;

/*
 *
 * 
 */
public class CrazyWithZeros {

    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int answer = divideTheseNumbers(x, y);                              //divideTheseNumbers method called, 5 and 0 passed as parameters
        } catch (Exception e)                                                   //any exceptions from previous method are called
        {
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b)                          //divideTheseNumbers method receives values from calling (main) method
            throws Exception {                                                  //throws clause specified highlighting method not wanting to handle the exception
                                                                                //AKA catch-or-throw rule
                                                                                
        int c;
        try {
            c = a / b;                                                          //numbers divided
            System.out.println("It worked!");                                   //if calculation works, message printed
        } catch (Exception e) {
            System.out.println("Didn't work the first time.");                  //catch clause catches the exception and message displayed in console
            c = a / b;                                                          //division occurs again but outside the try statement to catch error
            System.out.println("It worked the second time!");                   //not executed as another exception thrown for second time
        } finally                                                               //finally block executed and an ArithmeticException is thrown back to calling method
        {
            System.out.println("Better clean up my mess.");                     //message printed
        }
        System.out.println("It worked after all.");                             //statement executed after try block ends
        return c;                                                               //result of division returned
    }
}
