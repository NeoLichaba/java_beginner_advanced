package com.example.domain;

import java.text.NumberFormat;

/* Employee class created that handles all features that are common throughout the organisation
 * Employee class can be defined as the base class
*/

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {        //Constructor takes on parameters listed
        this.empId = empId;                                                     //this keyword used to the class field and not that in the parameters
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;        
    }
    
    public void raiseSalary(double increase){                                   //raiseSalary method with parameter
        
        //ensure positive value for method
        if (increase > 0) {
            salary += increase;                                                 //salary will increase and value of new salary increased by value in increase variable
        }
        
    }
    
    public void printEmployee (){                                               //printEmployee method
        System.out.println();
        
        //data from employee object printed out
        
        System.out.println("Employee id: " + getEmpId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee Soc Sec: " + getSsn());
        System.out.println("Employee salary: " + NumberFormat.getCurrencyInstance().format((double)getSalary()));
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

}
