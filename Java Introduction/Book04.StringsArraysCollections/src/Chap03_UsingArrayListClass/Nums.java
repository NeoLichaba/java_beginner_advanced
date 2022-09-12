
package Chap03_UsingArrayListClass;

import java.util.ArrayList;

/* Program demonstrates adding objects to array list
 * Can insert an object at a specific position in the list by listing the position in the add method
 * 
 */
public class Nums {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
                nums.add("One");
                nums.add("Two");
                nums.add("Three");
                nums.add("Four");
                nums.add(2, "Two and a half");
                System.out.println(nums);
    }
}
