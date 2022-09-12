
package Chap04_UsingLinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Neo
 */
public class AddLinkedList {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();                       //LinkedList declared with datatype String for variable officers
        officers.add("Blake");                                                  //Make use of add method in order to add objects
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        //add element to first position
        officers.addFirst("Neo");
        
        //add element to the last position
        officers.addLast("Nema");
        //for (String s : officers)
          //  System.out.println(s);
        
        //adding element to the third postion
        officers.add(2, "Boemo");
//for (String s : officers)
 //System.out.println(s);
 
        //Iterating LinkedList
        Iterator<String> iterator = officers.iterator();                        //iterator method is called to loop through officers collection
        while (iterator.hasNext()){                                             //while loop made use of to testExpression, if true, executes
            System.out.println(iterator.next());                                //made use of hasNext()and next() methods of Iterator to loop through officer collection
        }
    }
}
