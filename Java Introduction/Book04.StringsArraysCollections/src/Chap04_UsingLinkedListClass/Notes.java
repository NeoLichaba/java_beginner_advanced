
package Chap04_UsingLinkedListClass;

/* Linked List = a collection in which every object in the list maintains a pointer to the preceding and following object
 * Each element in a LinkedList is called a Node - each Node contains two items: 1) Content of the element; 2)Address/Reference to next node in linked list
 * Advantages: 
    - Size of array is fixed; LinkedList has no capacity issues
    - Easier to change pointers in preceding and following text in order to insert/remove items into the linked list
 * Suited for creating stacks (added to and retrieved from the front) and queues (added to the back and retrieved from the front)
 * Disadvantages:
    - Require more memory
    - Slower when it comes to sequential access

 > Creating a LinkedList
   ------------------------
    - LinkedList officers = new LinkedList();
    - declare a linkedlist variable, then call on a constructor to create the object
    - Can make use of generics to specify a type when you declare the linked list
      LinkedList<String> officers = new LinkedList<String>();

 > Adding Items to a LinkedList
   -----------------------------
    - make use of add method (similar to ArrayList class)
    - addLast method works the same was as the add method
    - addFirst is the inverse - begins adding from the front of the list (stacks them on top of one another)
      > e.g. LinkedList<String> officers = new LinkedList<String>();
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");
        officers.addFirst("McIntyre");
        for (String s : officers)
        System.out.println(s);
    - to specify position into the list, specify the index in the add method
    - add method throws IndexOutOfBoundsException - unchecked exception

 > Retrieving Items from a LinkedList
   -----------------------------
    - get method
    - throws IndexOutOfBoundsException
    - makes use of enhanced for loop
    - can make use of an iterator
    - getFirst - Retrieves the item from the list, doesn't delete; NoSuchElement exception
    - element - similar to getFirst; defined by Queue interface
    - peek and peekFirst - similar to getFirst but returns null
    - remove and removeFirst - both remove item from the list; NoSuchElement exception
    - poll and pollFirst - Similar to removefirst but returns null if the list is empty
    - pop
    
    Following methods retrieve the last item in the list:
    - getLast
    - peekLast
    - removeLast
    - pollLast

 > Updating LinkedList Items
   ---------------------------------
    - LinkedList<String> officers = new LinkedList<String>();
        // add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        // replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced:");
        System.out.println(officers);

> Removing LinkedList Items
 ---------------------------------
    - can remove items by specifying the index number
      e.g. officers.remove(3);
    - removing the item but specifying the object
      e.g officers.remove(tuttle);
    - removing all items from the list
      e.g officers.clear(); 

 */
public class Notes {
    
}
