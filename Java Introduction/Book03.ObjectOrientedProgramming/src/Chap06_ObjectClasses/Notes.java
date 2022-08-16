
package Chap06_ObjectClasses;

/* Classes that are NB to OOP: 
 *  Object - inherited by every other class;
 *  Class - used to obtain info about an object's type
 * 
 * Objects
    * All classes inherit the Object class
    * Inheritance hierachy eventually gets to a superclass that does not have an extends clause
    
    Objects as a type
    * Important to note the type of object referenced by a variable
    * If you are unfamiliar, one can specify its type as Object although compiler won't know
    * ArrayList class accepts Object as a parameter

    Methods of Object Class
    * Clone - makes copies of objects
    * Equals - compares objects
    * Finalize - made use of when the garbage collecter realises and object is no longer in use
    * getClass - used in conjunction with the Class class
    * hashCode - int representation of class that's useful for certain operations
    * toString - most commonly used method

    Primitives aren't objects
    * int and double are not objects, so they don't inherit anything from Object
    * To convert an int to a string, make use of wrapper class to create an object from the value and then call its toString method
    * e.g.String s = new Integer(x).toString();

 * toString Method (refer to TestToString examples)
    * Returns a toString representation of an object
    * Returns name of object's class + hashCode

 * The equals Method (refer to TestEquality1 & 2 example)
    * Testing objects for equality is a basic task of any OOP language
    * In order to create objects that are considered to be equal if they contain identical data:
            * Compare using the equals method than equal operator
            * Override equals Method in class to compare objects based on their data
    * When you override the equals method, ensure 5 conditions are met:
        1. Reflexive - return true
        2. Symmetric - x and y must both be true
        3. Transitive - ...
        4. Consistent - constantly return values of being true or false
        5. x.equals(null) should return 

 * The clone Method ((refer to CloneTest & 2 example)
    * Exact copy of an object
    * To create a clone, create a new object and set its fields to the same values as the original object
    * Inherited from the object class - available to all classes
    * Implementing the clone method 
        * protected access in object class
        * override the clone method and give it public access for other objects to clone your object
        * whenever the clone method is called for a class that overrides clone, cast the result to the desired object type
    
    * Using clone to create a shallow copy 
        * Clone method of object class can automatically create a copy of your object that contains duplicates of all the fields and immutable reference types;
        * Use clone method provided by Object class to clone your class - shallow copy
        * Having reference and not a complete copy of the object - do a deep clone in order to solve this probleml
            * Deep copy is a clone in which subobjects within main object are also cloned
        * Specify super.clone() to call a clone method from within your own clone method. Before that:
            * Cloneable interface supported - marks that class is appropriate for cloning
            * Enclose super.clone() in a try/catch statement that catches exception CloneNotSupportedException
        *

 * The Class Class
    * All classes are represented by an object of type Class
    * Object has information about the class itself
    * Make use of getClass() method to get a Class object. getClass() method
    * Initialise a variable with an object instance before you can call its getClass() method. Method returns Class
      object that corresponds to the type of object the variable refers to, not the type variable is declared.
     
    *  HourlyEmployee emp = new Employee(); - HourlyEmployee extends Employee class
       Class c = emp.getClass(); - c refers to Class object for HourlyEmployee class and not Employee class

    * Methods to note:
          » getName(): Returns a String representing the name of the class
          » getSuperclass(): Returns another Class object representing this Class object’s superclass

    Most common use of getClass to tell whether objects are of the same type by comparing their Class objects.
    Will work as Class object has only one instance for each different class used by the application
    Determine whether two or more objets are objects of the same type
    
        Object o1 = new Employee();
        Object o2 = new Employee();
        if (o1.getClass() == o2.getClass())
        System.out.println("They're the same.");
        else
        System.out.println("They are not the same.");

        Thus type of both objets is Employee therefore true

    *To find out whether object is of a particular type, use object's getClass method to obtain Class object
    * Use getName() to get class name
    * Use equals() to check class name
    
    
    if (emp.getClass().getName().equals("Employee"))
    System.out.println("This is an employee object.");
 */ 
public class Notes {
    
}

