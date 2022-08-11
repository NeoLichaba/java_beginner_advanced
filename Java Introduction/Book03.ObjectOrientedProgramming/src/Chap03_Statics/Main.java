
package Chap03_Statics;

/* Program aims to demonstrate the static keyword
 * static = modifier; single copy of a variable/method is created and shared
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Thloks");
		Friend friend2 = new Friend("Neo");                                                                //Create friend object
		
//		System.out.println(Friend.numberOfFriends);                     //Owned by class and therefore only need to call name of static member we're trying to access = numberOfFriends
                Friend.displayFriends();                                      //Accessing static methods invoked
        }
}
