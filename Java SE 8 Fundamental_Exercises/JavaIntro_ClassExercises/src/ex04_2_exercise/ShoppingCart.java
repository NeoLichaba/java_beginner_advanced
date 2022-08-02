package ex04_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName + " wants to purchase a " + itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 45.99;
        double tax = 1.15;
        int quantity = 2;
        double total = (price*quantity)*tax;
      
        
   
        // Modify message to include quantity 
        System.out.println(message);

        // Calculate total and then print the total cost
        String message1 = custName + " wants to purchase a " + itemDesc + " "+ "at" + " " + "R" + total;
        
        System.out.println(message1);
    }
    

}
    

