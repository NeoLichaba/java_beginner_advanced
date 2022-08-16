
package Chap06_ObjectClasses;

/** Program demonstrates implementation of the clone method
 * 
 *
 */
public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");                                         //Employee object created
        emp1.setSalary(40000.0);                                                //Employee salary set
        Employee emp2 = (Employee) emp1.clone();                                //Clone of employee object created. Return value cast to an Employee
        emp1.setLastName("Smith");                                              //Changes last name of second employee
        System.out.println(emp1);                                               //first employee printed out
        System.out.println(emp2);                                               //second employee object printed out
    }
}

class Employee {

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Object clone()                                                       //Overrides clone method with return type Object, not employee
    {
        Employee emp;
        emp = new Employee(                                                     //New employee object using first and last name from current object
                this.lastName, this.firstName);
        emp.setSalary(this.salary);                                             //New employee salary set to current object's salary
        return emp;                                                             //Returns cloned Employee object
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }

}
