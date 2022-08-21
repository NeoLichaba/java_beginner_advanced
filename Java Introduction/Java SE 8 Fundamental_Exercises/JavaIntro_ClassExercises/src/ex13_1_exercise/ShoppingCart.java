package ex13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList        
        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(days));

        // Loop through the ArrayList, printing out "sunday" elements in 
        // upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  
        for (String s : myArrayList) {
            if (s.equals("sunday")) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s);
            }
        }
        System.out.println(myArrayList);

    }
}
