/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap05_GenericCollectionClasses;

import java.util.LinkedList;

/**
 * Program demonstrates GenStack class that uses LinkedList to implement a stack
 * Exposes methods of the LinkedList class using names appropriate for a stack
 *
 *
 * 
 */
class GenStack<E> {  //→3                                                        formal type parameter <E> declared
                                                                                //users of class can specify type for stack's elements

    private LinkedList<E> list = new LinkedList<E>(); //→5                      

    public void push(E item) //→7                                               //push method accepts parameter of type E
    {
        list.addFirst(item);                                                    //addFirst method used to add item to beginning of the list
    }

    public E pop() //→12                                                        pop method returns value of type E
    {
        return list.poll();                                                     //uses poll method (removes and returns the first element in linkedlist    
    }                                                                           //returns null if list is empty

    public E peek() //→17                                                       peek returns value of type E
    {
        return list.peek();                                                     //returns result of peek method
    }

    public boolean hasItems() //→22                                             returns opposite of linked list's isEmpty method
    {
        return !list.isEmpty();
    }

    public int size() //→27                                                     returns size of linked list
    {
        return list.size();
    }
}

public class P455_GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();
        System.out.println(
                "Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
        System.out.println("There are "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
        System.out.println("There are still "
                + gs.size() + " items in the stack.\n");
        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            System.out.println(gs.pop());
        }
        System.out.println("There are now "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
    }
}
