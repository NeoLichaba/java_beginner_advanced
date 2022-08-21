package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] items = new String[3];
        items[0] = "Jersey";
        items[1] = "Joggers";
        items[2] = "Leggings";

        // Change message to show the number of items purchased.
        String message1 = custName + " wants to purchase " + items.length + " " + "items.";

        System.out.println(message);
        // Print an element from the items array.
        System.out.println(items[0]);

    }

}
