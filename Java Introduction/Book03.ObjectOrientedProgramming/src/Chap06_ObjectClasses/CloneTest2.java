package Chap06_ObjectClasses;

/* Program demonstrates creation of deep copies 
 * All fields od original objects are copied exactly
 * 
 */
public class CloneTest2 {

    public static void main(String[] args) {                                    //Cloneable interface created within main method
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
{                                                                               //Following properties are displayed in Employee class

    private String lastName;                                        
    private String firstName;
    private Double salary;
    public Address address;                                                     //Address field holds an object of type Address

    public Employee(String lastName, String firstName) {                        //Constructor for Employee class created to create
        this.lastName = lastName;                                               //object of employee (ref. toString method) 
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

    @Override                                                                   //Override clone method otherwise unable to clone object 
    public Object clone()                                                       //Clone method in employee class 
    {
        Employee emp;
        try {
            emp = (Employee) super.clone();                                     //shallow copy created of Employee object created - noted from keyword super; typecasted to Employee
                                                                                //Copy of lastName, firstName and salary created
            emp.address = (Address) address.clone();                            //shallow copy of Address object created and assigns it to address field of cloned Employee object
                                                                                //Create new object of Address object
                                                                                //Both create deep cloning methods - second version is independent of the original version you're wanting to perform  
        } catch (CloneNotSupportedException e)                                  //Catches exception - class implements Cloneable thus won't happen
                                                                                //CloneNotSupportedException is a checked exception and thus must be caught    
        {
            return null;                                                        // will never happen
        }
        return emp;                                                             //Returns cloned employee object
    }

    @Override                                                                   //Always override toString method in respective class to return string representation
    public String toString() {                                                  //Prints out Employee class properties
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                 + this.salary + "]";
    }
}

class Address implements Cloneable                                              //Address class implements Cloneable interface - market interface
{

    private String street;                                                      //Address properties
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

    @Override                                                                   //Clone method of interface to be overriden otherwise unable to clone it
    public Object clone()                                                       //Clone method of Address class
    {
        try {
            return super.clone();                                               //Shallow copy of Address object returned
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }

    public String getAddress() {                                                //
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
