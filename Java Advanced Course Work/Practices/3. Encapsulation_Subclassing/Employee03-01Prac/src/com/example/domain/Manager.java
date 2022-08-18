
package com.example.domain;

/* Program demonstrates Inheritance of a class
 *
 * 
 */
public class Manager extends Employee{                                          //Manager subclass of Employee
    
    private String deptName;                                                    //deptName declared as a String; private visibility
    
    public Manager(int empId, String name, String ssn, double salary, String deptName) {    //Constructor created with value of fields inherited from base class
        super(empId, name, ssn, salary);                                        //calling superclass constructor (p287)
        this.deptName = deptName;
        
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {                                               //retrieve info on deptName through getter method
        return deptName;                                                        //visible within its own class
    }

    
    
    
}
