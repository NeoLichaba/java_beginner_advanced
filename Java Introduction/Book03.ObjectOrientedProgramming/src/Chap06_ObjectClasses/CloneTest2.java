package Chap06_ObjectClasses;

/**
 *
 * @author User
 */
public class CloneTest2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");                                          //Anthony Martinez employee created    
        emp1.setSalary(40000.0);
        emp1.address = new Address(
                "1300 N. First Street",
                "Fresno", "CA", "93702");                                        //Employee address is set
        Employee emp2 = (Employee) emp1.clone();                                 //Employee object cloned
        System.out.println(
                "**** after cloning ****\n");                                   //Employee objects printed after cloning - should have identical data    
        printEmployee(emp1);
        printEmployee(emp2);
        emp2.setLastName("Smith");                                              //Second employee name changed
        emp2.address = new Address(                                             //Second employee's address is changed
                "2503 N. 6th Street",
                "Fresno", "CA", "93722");
        System.out.println(
                "**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);                                                    //Employee objects printed after data changed for second employee; different data should exist for objects
    }

    private static void printEmployee(Employee e)                               //utility method prints data for an Employee object
    {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}

class Employee implements Cloneable                                             //Employee class implements Cloenable interface
{

    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;                                                     //Address field hols an object of typeAddress

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
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

    public Object clone()                                                       //Clone method in employee class
    {
        Employee emp;
        try {
            emp = (Employee) super.clone();                                     //shallow copy created of Employee object created
            emp.address = (Address) address.clone();                            //shallow copy of Address object created and assigns it to address field of cloned Employee object
        } catch (CloneNotSupportedException e)                                  //Catches exception - class implements Cloneable thus won't happen
        {
            return null; // will never happen
        }
        return emp;                                                             //Returns cloned employee object
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}

class Address implements Cloneable                                              //Address class implements Cloneable
{

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city,
            String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Object clone()                                                       //Clone method of Address class
    {
        try {
            return super.clone();                                               //Shallow copy of Address object returned
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }

    public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
