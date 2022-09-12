
package Chap04_UsingLinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author neo
 */
public class UpdatingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();
        // add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println("Original LinkedList: " + officers);
        // replace Tuttle with Murdock
        officers.set(2, "Murdock");
        //System.out.println("\nTuttle is replaced:");
        //System.out.println(officers);
        officers.removeFirst();
        //System.out.println(officers);
        officers.removeLast();
         //System.out.println(officers);
         //officers.clear(); 
         //System.out.println(officers);
         
         Iterator<String> iterator = officers.iterator();
         while(iterator.hasNext()){
             System.out.println(iterator.next()+ "");
         }
         officers.remove(3);
         
         System.out.println("After removing third element: ");
         
         Iterator<String> iterator1 = officers.iterator();
         while(iterator1.hasNext()){
             System.out.println(iterator1.next()+ "");
         }   

    }
}
