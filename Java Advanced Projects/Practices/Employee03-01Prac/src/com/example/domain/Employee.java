package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;        
    }
    
    public void raiseSalary(double increase){
        
        //ensure positive value for method
        if (increase > 0) {
            salary += increase;
        }
        
    }
    
    public void printEmployee (){
        System.out.println();
        
        //data frpm employee object printed out
        
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
