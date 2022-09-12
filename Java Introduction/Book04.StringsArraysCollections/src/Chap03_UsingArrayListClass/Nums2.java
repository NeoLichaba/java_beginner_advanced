
package Chap03_UsingArrayListClass;

import java.util.ArrayList;

/* Program demonstrates how one may access elements within an array
 * 
 * @author User
 */
public class Nums2 {
    public static void main(String[] args) {
        
        ArrayList<String> nums = new ArrayList<String>();
                nums.add("One");
                nums.add("Two");
                nums.add("Three");
                nums.add("Four");
                nums.add(2, "Two and a half");

        //for (int i = 0; i < nums.size(); i++)                                 //for loop used to iterate through the size nums arrayList
          //  System.out.println(nums.get(i));                                  //use getMethod to print out nums at position i
            //for (String s : nums)                                             //enhanced for statement - String s elements retrieved from nums arrayList
            //System.out.println(s);                                            //printed in console
            for (String s : nums)
        {
            int i = nums.indexOf(s);                                            //makes use of indexOf method to return position of occurrence of string
            System.out.println("Item " + i + ": " + s);
        }
    }}

