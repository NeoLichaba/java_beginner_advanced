
package Chap07_Classes_LambdaExpressions;


/*What the chapter will cover:

    ** 3 advanced types of classes:
        > Inner class
        > Static inner classes
        > Anonymous inner classes
    ** Lambda expressions - simplify task of creating and using anonymous classes
 * Concepts required for when 

Declaring Inner Class
----------------------
    * Inner class is declared inside another class
    * Class that contains the inner class = outer class
    * Visibility modifier can be used

Understanding inner class (refer to TickTockInner listing)
------------------------------------------------------------
    * Inner class automatically has access to fields and methods of outer class - even to private fields and methods
    * Has access to instance data for outer class
    * Create a class that's only of interest to outer class
    * Code in inner class is to refer to instance of outer class. List name of outer class followed by dot operator and this
        > MyOuterClass.this - refer to instance of outer class

    Observer Pattern
    ------------------

    * Event listeners are part of Delegation Event Model - implementation of Observer pattern
    * Useful when creating objects that interact with one another when changes occur
    * Observable object - object whose changes are being monitored
    * Observer object - object monitoring changes
 `  * Part of Observable and Observer interfaces

Using Static Inner Classes (refer to TickTockStatic listing)
-------------------------------------------------------------

    * Similar to inner class but does not require instance of outer class
    * Static inner class can't access any nonstatic fields or methods in its outer class

Using Anonymous Inner Classes (refer TickTockAnon listing)
----------------------------------------------------------
    * Anon class defined where you're wanting to instantiate it

    >> Creating an anon class
        * new ClassOrInterface() {class-body}

Lambda Expressions
-------------------------------------------------------------
 * Lambda expressions lets you create an anon class that implements a functional interface
 * Make use of arrow operator
 * Used as arguments for another method
    * Has:
        >> Parameters - left to the arrow token
            (e.g myList.replaceAll((String s) -> { >>Method body 
                return s.toUpperCase();
            }
        );
        >> Method body 
        >> Return value
 * Recognised by the -> 

    Enhanced APIs that use Lambda
        >>Util.functions - target types for lambda expressions
        >>Util.stream - provides classes that suppport ops on streams of values
        >>util - includes List and ArrayList
 * Lambda type specifies the type of expression a method is expecting
 * UnaryOperator Lambda Type - single input and returns a value of the same type as input. MUST return the same type
    .e.g myList.replaceAll(s -> s.toUpperCase());
 *Predicate Lambda Type - takes a single input argument and returns a boolean

    * 
 */
public class Notes {
    
}
