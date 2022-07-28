package com.example.test;

import com.example.domain.Item;
import com.example.domain.ShoppingCart;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.NumberFormat;
import java.util.List;

public class DeserializeTest {

    public static void main(String[] args) {
        String directory = "C:\\Users\\User\\OneDrive\\Desktop\\Code College_2022\\Java\\Java Course Material\\Java Advanced\\D84838GC10_labs\\labs\\13-IO_Fundamentals\\practices\\practice2\\SerializeShoppingCart13-02Prac\\src\\com\\example\\test";
         String cartId = null;
        System.out.println("Enter the ID of the cart file to deserialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }

        // Attempt to open the file and deserialize it into an object
        String cartFile = directory + "cart" + cartId + ".ser";
        ShoppingCart cart = null;
        try (FileInputStream fis = new FileInputStream(cartFile);
                ObjectInputStream in = new ObjectInputStream(fis)) {
            cart = (ShoppingCart) in.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Exception deserializing " + cartFile + ": " + e);
            System.exit(-1);
        }
        System.out.println("Successfully deserialized shopping cart with ID: " + cart.getCartID());
        System.out.println("Shopping cart contains: ");
        List<Item> cartContents = cart.getItems();
        for (Item item : cartContents) {
            System.out.println(item);
        }
        System.out.println("Shopping cart total: "
                + NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));
    }
}