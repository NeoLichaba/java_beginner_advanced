
package Chap02_HandlingEvents;

/* event triggered when the user clicks the button by providing an event handler that’s executed when the event occurs.
 * property bindings - let you write code that responds to changes in the value of certain types of class 
   fields, dubbed property fields
 * event handler examines the event object, determine exactly what type of event occurred, and respond
 * Different types of Event Classes - Action, Touch, Key, Input, Mouse etc. 
 * four important terms you need to know:
    » Event: An object that’s created when the user does something noteworthy 
    with a component, such as clicking it.
    » Event source: The object on which the event initially occurred.
    » Event target: The node that the event is directed at.
    This is usually the button or other control that the user clicked or otherwise 
    manipulated. (In most cases, the event source and the event target are the 
    same.)
    » Event handler: The object that listens for events and handles them when 
    they occur.
    The event-listener object must implement the EventHandler interface, which 
    defines a single method named handle. The EventHandler
    interface is defined in the package javafx.event

 * EventHandler Interface
   ------------------------------
   void handle<T event> -  Called when an event occur

 * Handling Events 
   ----------------------------------
   - Includes wiring classes and interfaces to create a program
   - 3 steps to take to handle a JavaFX Event
     1. Create an event source - generally as a private field and outside of the start method
     2. Create an event handler - create an object that implements an interface - EventHandler. Object provides implementation of the handle method
        Four ways to create an event handler:
        • Add implements EventHandler to the program’s Application class and 
        provide an implementation of the handle method.
        You figure out how to use this technique in the section “Implementing the 
        EventHandler Interface.”
        • Create an inner class that implements EventHandler within the 
        Application class.
        You figure out how to use this technique in the section “Handling Events 
        with Inner Classes.”
        • Create an anonymous class that implements EventHandler.
        I show you how to use this technique in the section “Handling Events with 
        Anonymous Inner Classes.”
        • Use a lambda expression to implement the handle method.
        You read about how to use this technique in the section “Using Lambda 
        Expressions to Handle Events.”
     3. Register the event handler with the event source - method called whenever event occurs

    Implementing the EventHandler Interface (refer to AddSubtract1 listing)
    --------------------------------------------------------------------------
    
   


 * @author Neo
 */
public class Notes {
    
}
