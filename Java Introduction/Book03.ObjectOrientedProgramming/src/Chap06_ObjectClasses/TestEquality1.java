package Chap06_ObjectClasses;

/* Program demonstrates the equals Method
 * 
 *
 */
public class TestEquality1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(                                           //2 Employee objects are created with identical data
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1 == emp2) {                                                     //Compares the data of the 2 object references, NOT the actual data
            System.out.println(
                    "These employees are the same.");                           //Only return true if both objects refer to the same instance of the Employee class
                                                                                //To return true, make use of equals method than equal operator
        } else {
            System.out.println(                                                 //Thus output is false
                    "These are different employees.");
        }
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
