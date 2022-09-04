package Chap02_UsingArrays;

/* Program resolves a math problem using an array and nested for loops
 * 
 * 
 */
public class P398_BoboAndTheLockers {

    public static void main(String[] args) {
        // true = open; false = closed
        boolean[] lockers = new boolean[21]; //→6                             Array of booleans with 1001 elements initialised
        // close all the lockers
        for (int i = 1; i <= 20; i++) //→9                                                                   
        {
            lockers[i] = false;                                                 //lockers being open are initialised to false
        }
        for (int skip = 1; skip <= 20; skip++) //→12                          Iteration through loop demonstrates one complete trip
                                                                                //skip variable represents that number of lockers Bobo skips on each trip
        {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 20; //→16                        Loop represents one stop at a locker on a trip through the hallways
                    locker += skip) {                                           //skip variable + index variable = Bobo accessing every nth locker on each trip
                lockers[locker] = !lockers[locker]; //→18                       reverses the setting of each locker
            }
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
        
        String list = "";                                                       //list variable accepts a String
        int openCount = 0;
        for (int i = 1; i <= 20; i++) //→27                                   counts and list the open lockers
        {
            if (lockers[i]) {
                openCount++;                                                    //Adds locker number for each open locker
                list += i + " ";                                                
            }
        }
        System.out.println("Bobo left " + openCount                             
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }

}
//Numbers open were perfect squares
