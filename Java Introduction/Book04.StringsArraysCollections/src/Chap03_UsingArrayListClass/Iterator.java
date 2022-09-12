package Chap03_UsingArrayListClass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *
 */
public class Iterator {

    public static void main(String[] args) {

        ArrayList<String> nums = new ArrayList<String>();                            //create an array list
        nums.add("One");                                                    //add Strings to array list
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        String s;
        Iterator e = nums.iterator();                                       //Iterator method called to get an iterator for nums array list

        while (e.hasNext())                                                     //hasNext method called in the while statement
        {
            s = (String) e.next();                                              //next returns element to be printed; casted to a String due to Iterator interface
            //returning an object
            System.out.println(s);
        }
    }
}
