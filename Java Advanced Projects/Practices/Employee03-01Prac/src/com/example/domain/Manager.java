
package com.example.domain;

/* Program demonstrates Inheritance of a class
 *
 * 
 */
public class Manager extends Employee{
    
    private String deptName;
    
    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    
    
    
}
