/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items;
        items = new ArrayList();
        items.add("Jeans");
        items.add("Skirt");
        items.add("Jersey");
        
        System.out.println(items);
        
        // add (insert) another element at a specific index
        items.add(3, "Hats");
        System.out.println(items);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (items.contains("Shirt")){
            items.remove("Shirt");
            System.out.println(items);
        }
    }   
            
}
