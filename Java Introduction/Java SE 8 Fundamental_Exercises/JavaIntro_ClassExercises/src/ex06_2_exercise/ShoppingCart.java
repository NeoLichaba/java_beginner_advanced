/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06_2_exercise;

/**
 *
 * @author User
 */
public class ShoppingCart {
    public static void main(String[] args) {
        
        // Declare and initialize 2 Item objects
     
       Items item1 = new Items();
       Items item2 = new Items();            
	

	// Print both item descriptions and run code.
        item1.desc= "Sneakers";
        item2.desc = "Skirts";
        
        System.out.println("Item 1: " + item1.desc);
        System.out.println("Item 2: " + item2.desc);

	// Assign one item to another and run it again.
        item1=item2;
        
        System.out.println("Current items: " + item1.desc);
    }
    
}
