
package Chap03_Statics;

/* Friend class
 *
 * 
 */
public class Friend {
   
    String name;
	
	static int numberOfFriends;                                             //Static variable created - all instances of class share variable (i.e. static member)
	
	Friend(String name){                                                    //Constructor defined with String name passed into parameters
		this.name=name;                                                 
		numberOfFriends++;                                              //Number of friends increments
	}
        
        static void displayFriends(){                                           //Static method
           System.out.println("You have " + numberOfFriends + " friends");
}
}

