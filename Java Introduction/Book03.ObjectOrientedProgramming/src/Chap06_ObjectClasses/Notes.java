
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

 * The equals Method (refer to TestEquality1 example)
    * Testing objects for equality is a basic task of any OOP language
    * In order to create objects that are considered to be equal if they contain identical data:
            * Compare using the equals method than equal operator
            * Override equals Method in class to compare objects based on their data
    * When you override the equals method, ensure 5 conditions are met:
        1. Reflexive - return true
        2. Symmetric - x and y must both be true
        3. Transitive - ...
        4. Consistent - constantly return values of being true or false
        5. x.equals(null) shoud return false
 */ 
public class Notes {
    
}

