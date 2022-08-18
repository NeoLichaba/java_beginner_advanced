package Chap06_ObjectClasses;

/* Program demonstrates the equals Method vs. equals Operator
 * 
 *
 */
public class TestEquality1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(                                           //2 Employee objects are created with identical data but considered to be different objects 
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1 == emp2) {                                                     //Equals operator tests to see if referencing the exact same object
            System.out.println(
                    "These employees are the same.");                           //Only return true if both objects refer to the same instance of the Employee class
                                                                                //To return true, make use of equals method than equal operator
        } else {
            System.out.println(                                                 //Thus output is false
                    "These are different employees.");
        }
    }
}

class Employee {                                                                //Employee class created with the following properties

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {                        //Constructor class created
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
