/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Scarf", 1, 30.00);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int retval = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (retval < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            item1.displayItem();

            // Test your code for both valid and invalid values
        }
    }
}
