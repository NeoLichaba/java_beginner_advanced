package Chap06_ObjectClasses;

/* Program makes use of equal method vs. equals operator for comparison
 * 
 *
 */
public class TestEquality2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");                                         //Employee object created with name Anthony Martinez
        Employee emp2 = new Employee(
                "Martinez", "Anthony");                                         //Employee object created with name Anthony Martinez                              
        if (emp1.equals(emp2))                                                  //Compares the 2 employee objects by using the equals method
        {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee                                                                  //Employee class with the following private properties
{

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {                        //Constructor created
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public boolean equals(Object obj)                                           //Overridden equals method; must override to have an effect
                                                                                //Comes from the object class
    {
        
        if (this == obj) {                                                      // an object must equal itself
            return true;                                                        //Returns true if same instance objects are being compared; first equality test done (Reflexive rule)
        } 
        if (this == null) {                                                     // no object equals 
            return false;                                                       //Returns false if object being compared is null; last equality test - nothing is equal to null (non null rule)
        } 
        if (this.getClass() != obj.getClass()) {                                // objects of different types are never equal - using getClass method
            return false;                                                       //Returns false if object being compared isn't of the correct type - symmetry rule
        } // cast to an Employee, then compare the fields
        Employee emp = (Employee) obj;                                          //Other object casted - comparing 2 different Employee objects 
        return this.lastName.equals(emp.getLastName())                          //Two fields are compared - lastName and FirstaName
                && this.firstName.equals(emp.getFirstName());                   //To compare strings, best to compare using equals method, int = equal operator
    }                                                                           //return true if details (lastName and firstName) are the same;
}
