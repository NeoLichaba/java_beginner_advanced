
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
   

 * @author Neo
 */
public class Notes {
    
}
