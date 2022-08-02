
package ex05_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 45.99;
        int quantity = 2;
        double tax = 1.15;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
        
        
        
        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message += "s";
            
        }
         
        
        // Test outOfStock and notify user in either case.  
       if (outOfStock) {
           System.out.println("Sorry," + " " + itemDesc + "is out of stock");
           
       } else {
           System.out.println(message);
           System.out.println("Total cost including tax is: R" + total);
       }
        
        
    }
    
}
