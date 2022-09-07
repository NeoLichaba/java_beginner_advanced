
package Chap05_GenericCollectionClasses;

/* Compiler preventing user from adding the wrong type of data to a collection is due to generics
 * Stack - Uses LinkedList class to implement a specific type of collection; items are added to the front and retrieved from the front
 * Queue - Collection in which items are added to the end and retrieved from the front
 * Generics allow for only certain types of objects to be added to the collection
 * ArrayList<Employee> empList = new ArrayList<Employee>();
 * No need to cast object prior to using it 

 * Creating a Generic Class
   -------------------------------
   > Classes created that can be used for any type specified by programmer at compile time
   > formal type parameters - list type parameter after class name in <> - e.g. public class ArrayList<E>
   > <E> = element type stored in list
   > public boolean add(E o)
        {
         // body of method omitted (thank you)
        }
        - E - formal parameter
        - add method only accepts E objects
   > formal type parameter as return type - 
        public E get(int index)
        {
        // body of method omitted (you're welcome)
        }
        - E is the return type
   > Use formal type parameter within your class to create objects of any class that accepts formal typer parameters
        public Object clone()
        {
         try
         {
            ArrayList<E> v = (ArrayList<E>) super.clone();
            v.elementData = (E[])new Object[size];
            System.arraycopy(elementData, 0,
            v.elementData, 0, size);
            v.modCount = 0;
            return v;
         }
            catch (CloneNotSupportedException e)
         {
            // this shouldn't happen since we're Cloneable
            throw new InternalError();
         }
        }
    > Key advantage - typing happens at compile time
    >               - After you specify the value of the formal type parameter, compiler knows how to do the type checking implied by parameter

 * A Generic Stack Class (refer to example GenStackTest)
   ---------------------------------------------------------
    * A collection that lets you add objects to the top and remove from the top
    * Methods: 
        » push: This method adds an object to the top of the stack.
        » pop: This method retrieves the top item from the stack. The item is removed 
               from the stack in the process. If the stack is empty, this method returns null.
        » peek: This method lets you peek at the top item on the stack. In other words, 
                it returns the top item without removing it. If the stack is empty, it returns 
                null.
        » hasItems: This method returns a boolean value of true if the stack has at 
                    least one item in it.
        » size: This method returns an int value that indicates how many items are in 
                the stack.

 
 * Using Wildcard-Type Parameters
   -------------------------------
    * Inheritane doesn't work when it comes to formal type paramters. Use a feature of generics = wildcards
    * To create a method that accepts any type of ArrayList: public void addItems(ArrayList<?> list)
    * ? indicates you can code any kind of type here
    * To limit the parameter to collections of a specific superclass - add extends clause to wildcard
      e.g. public void addItems(ArrayList<? extends Employee> list)
    * For addItems method to accept an ArrayList of type E or any of its subclasses. To do that, you’d declare the addItems method like this
      e.g public void addItems(ArrayList<? extends E> list)
      - <? extends E> = arrayList can be of type E or any type thaty extends E

* A Generic Queue Class (refer to example GenQueueTest)
 -------------------------------------------------------
    * Queue - a collection that lets you add objects to the end of the collection and remove from the top
    * Queues are used in data processing applications to networking systems
    * GenQueue Methods:
      » enqueue: This method adds an object to the end of the queue.
      » dequeue: This method retrieves the first item from the queue. The item is
                 removed from the queue in the process. If the queue is empty, this method 
                 returns null.
      » hasItems: This method returns a boolean value of true if the queue has at 
                  least one item in it.
      » size: This method returns an int value that indicates how many items are in 
              the stack.
      » addItems: This method accepts another GenQueue object as a parameter. All 
                  the items in that queue are added to this queue. In the process, all the items 
                  from the queue passed to the method are removed. The GenQueue parameter 
                  must be of the same type as this queue or a subtype of this queue’s type

    * GenQueue class uses a LinkedList to implement its queue

* Using Diamond Operator
 -----------------------------------
    * Specify types twice when you create a variable of a generic type, use constructor to instantiate an object
    * Can skip having to specify type twice and use diamond operator when calling the constructor
    * ArrayList<String> nums = new ArrayList<>();

 * 
 */
public class Notes {
    
}
