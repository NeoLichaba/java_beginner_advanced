
package Chap03_UsingArrayListClass;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DeletingElements {

    
    public static void main(String[] args) {
        
         ArrayList<String> emps = new ArrayList<String>();                          //Employee element = datatype, assuming to be a String
        // create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        // add employee objects to array list
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        // print the array list
        System.out.println(emps);
        // remove one of the employees
        emps.remove(emp2);
        // print the array list again
        System.out.println(emps);

    }

    private static class Employee {

        public Employee() {
        }
    }
}
    
