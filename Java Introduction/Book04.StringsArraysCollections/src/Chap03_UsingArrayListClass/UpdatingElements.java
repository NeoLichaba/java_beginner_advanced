
package Chap03_UsingArrayListClass;

import java.util.ArrayList;

/* Program seeks to demonstrate how one can update an arrayList
 * Use set method used to replace an existing object with another object

 *
 * @author Neo
 */
public class UpdatingElements {
    
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
            nums.clear();                                                       //clear method - removes all elements from the list
            nums.add("One");                                                    //first 3 strings created
            nums.add("Two");
            nums.add("Three");
            System.out.println(nums);                                           //printed out onto console
            nums.set(0, "Uno");                                                 //strings created replaced by another string    
            nums.set(1, "Dos");
            nums.set(2, "Tres");
            System.out.println(nums); 
    }
 
}
