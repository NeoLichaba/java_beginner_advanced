package Chap06_ObjectClasses;

/* Program tests the toString method
 * 
 * 
 */
public class TestToString {

    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");                                                     //New Employee object created
        System.out.println(emp.toString());                                     //Results printed to the console
        //println method automatically calls toString method of any object you pass it
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {                                                  //Always override toString method in classes

        /*return "Employee["                                                    //Employee class hard coded into toString 
                + this.firstName + " "
                + this.lastName + "]"; */
        return this.getClass().getName() + "["                                  //Make use of getClass method to retrieve actual class name at run time
                + this.firstName + " "                                          //getClass method returns Class object; Class object getName method retrieves actual class name
                + this.lastName + "]";
    }
}
