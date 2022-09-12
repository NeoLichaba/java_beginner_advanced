
package Chap03_UsingArrayListClass;

/* Collection classes are designed to simplify programming for apps that have to keep track of groups of objects
 * Generics introduced to make working with collections easier - allows you to create list objects (i.e. ArrayList and LinkedList)
 * Lambda expressions - efficient at dealing with collections that have a large number of items

 * ArrayList is different to an Array in that:
    - Automatically resizes iteself
    - Can insert elements into the middle of the collection
    - Can delete items and other items moves forward one position to fill the spot previously occupied
    - Uses an internal array to store data - creates a new array with larger capacity

 >> Creating an ArrayList Object
 -------------------------------------
    - ArrayList signs = new ArrayList();
      - signs variable declared and ArrayList constructor called to instantiate the ArrayList object, assign it to variable 
      - No need to specify capacity
      - Capacity of array list is not a fixed limit
      - Can specify the type of elements that array list is allowed to contain (e.g. ArrayList<String> signs = new ArrayList<String>();)
        > Generics implemented in this case as compiler will complain if incorrect type is added 

 >> Adding Elements (refer to Nums example)
 --------------------------------------------
    - Use add method to add objects to array list
    - Can insert an object at a specific position in the list by listing the position in the add method.
      > e.g. ArrayList<String> nums = new ArrayList<String>();
                nums.add("One");
                nums.add("Two");
                nums.add("Three");
                nums.add("Four");
                nums.add(2, "Two and a half");
      > Throws IndexOutOfBoundsException if an object isn't already at the index postion you specify
 
 >> Accessing Elements
 ----------------------------------------
    - Use get method to access a specific element in an array list
      > for (int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));
            - size method used to set the limit for loop's index variable
    - Use enhanced for loop - retrieve all elements
      > for (String s : nums)
            System.out.println(s);
            - each String element in the nums arraylist is printed to the console
`   - Use indexOf method in order to obtain the index number of a object in an array list
      > for (String s : nums)
        {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);
        }
        - Prints index number of each String along with the string

 >> Printing an ArrayList
 ----------------------------------------
    - toString method makes it easy to print contents of an arraylist
    - Returns a string object representing value of int - toString();
    - Returns a String object representing a specified integer -toString(int i);


 >> Using an Iterator
 ----------------------------------------
    - Step through elements of a collection
    - Better to make use of enhanced for statement
    - Iterator object implements Iterator interface. Defines 3 methods that allow you to acess each element of a collection:
      - hasNext() - Returns true if collection has one element that hasn't been retrieved
      - next() - Returns next element in collection
      - remove() - Removes recently retrieved element
    e.g. ArrayList<String> nums = new ArrayList<String>();                      //create an array list
            nums.add("One");                                                    //add Strings to array list
            nums.add("Two");
            nums.add("Three");
            nums.add("Four");
            String s;
            Iterator e = nums.iterator();                                       Iterator method called to get an iterator for nums array list
                                                                                
            while (e.hasNext())                                                 hasNext method called in the while statement
            {
             s = (String)e.next();                                              //next returns element to be printed; casted to a String due to Iterator interface
                                                                                returning an object
             System.out.println(s);
            }

 >> Updating Elements
 ----------------------------------------
    - set method used to replace an existing object with another object
    - ArrayList<String> nums = new ArrayList<String>();
            nums.clear();
            nums.add("One");                                                    first 3 string created
            nums.add("Two");
            nums.add("Three");
            System.out.println(nums);                                           printed out onto console
            nums.set(0, "Uno");                                                 strings created replaced by another string    
            nums.set(1, "Dos");
            nums.set(2, "Tres");
            System.out.println(nums);                                           contents print to the console again

>> Deleting Elements
 ----------------------------------------
    - clear method lets you remove all the elements
    - remove method lets you remove an element based on the index number
    - Can pass the actual object you wante removed if uncertain of index number
      ArrayList<Employee> emps = new ArrayList<Employee>();
        // create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        // add employee objects to array list
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        // print the array list
        System.out.println(emps);
        // remove one of the employees
        emps.remove(emp2);
        // print the array list again
        System.out.println(emps);

    - The clear and remove methods don’t delete objects; they simply 
      remove the references to the objects from the array list. Like any other 
      objects, the objects in a collection are deleted automatically by the garbage 
      collector — and then only if the objects are no longer being referenced by 
      the program.
    - You can remove more than one element at the same time by using the 
      removeRange method. On it, you specify the starting and ending index 
      numbers. (Note that this method removes all elements between the elements 
      you specify, but the elements you specify aren’t themselves removed. 
      removeRange(5, 8), for example, removes elements 6 and 7, but elements 5 
      and 8 aren’t removed.)
    - You can also use the removeAll method to remove all the objects in one 
      collection from another collection. A similar method, retainAll, removes all 
      the objects that are not in another collection



 */   
public class Notes {
    
}
