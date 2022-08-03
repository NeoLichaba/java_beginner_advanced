
package Chap01_OOP;

/* Program displays Fish class applying more than 1 interface
 *
 * 
 */

public class Fish implements Prey,Predator{

        //methods to be implemented
	@Override
	public void hunt() {
		System.out.println("*The fish is hunting*");
		
	}

	@Override
	public void flee() {
		System.out.println("*The fish is fleeing*");
		
	}
}
