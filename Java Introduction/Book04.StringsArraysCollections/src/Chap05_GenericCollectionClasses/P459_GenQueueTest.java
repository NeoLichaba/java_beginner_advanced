package Chap05_GenericCollectionClasses;

/* Program demonstrates GenQueue class
 * 
 * 
 */
import java.util.*;

class GenQueue<E> //→3                                                          formal type parameter <E>; users can specify type for the elements of queue
{

    private LinkedList<E> list = new LinkedList<E>(); //→5                      

    public void enqueue(E item) //→7                                            type E parameter accepted
    {
        list.addLast(item);                                                     //makes use of addLast method to add item to end of queue
    }

    public E dequeue() //→12                                                    returns method of value type E
    {
        return list.poll();                                                     //poll method used to return first item in list
    }

    public boolean hasItems() //→a17                                            //opposite of isEmpty method returned
    {
        return !list.isEmpty();
    }

    public int size() //→a22                                                    returns result of size method
    {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) //→a27                        accepts parameter that must be another GenQueue object
                                                                                //elements type needs to be the same GenQueue's object elements or a subtype
    {
        while (q.hasItems()) {                                                  //while loop removes all items from q parameter
            list.addLast(q.dequeue());                                          //add them to queue
        }
    }
}


public class P459_GenQueueTest {

    public static void main(String[] args) {
        GenQueue<Employee> empList;                                             //GenQueue object hold Employee objects assigned to variable empList
        empList = new GenQueue<Employee>();
        GenQueue<HourlyEmployee> hList;                                         //GenQueue object created that holds HourlyEmployee objects (subclass of Employee), assigned to variable hList
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee(                                       //Employees are created and added to hList queue
                "Trump", "Donald"));
        hList.enqueue(new HourlyEmployee(
                "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Forbes", "Steve"));
        empList.addItems(hList);                                                //addItems method called to transfer employees from hList queue to empList queue
                                                                                //HourlyEmployee = subclass of Employee thus addItems method of empList accepts hList as parameter    
        while (empList.hasItems()) {                                            //while loop used to print employees now in empList queue
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName
                    + " " + emp.lastName);
        }
    }
}

class Employee {

    public String lastName;
    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;

    }
}

class HourlyEmployee extends Employee {

    public double hourlyRate;

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }
}
