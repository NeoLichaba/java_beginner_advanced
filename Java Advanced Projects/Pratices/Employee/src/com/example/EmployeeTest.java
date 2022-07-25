
package com.example;

/*
 *
 * 
 */

import com.example.domain.Employee;

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instance off Employee class created
        
        Employee emp = new Employee();
        
        //data added to object using setter methods
        
        emp.setEmpId(101);
        emp.setName("Neo Lichaba");
        emp.setSsn("0115550429");
        emp.setSalary(120_500.00);
        
        System.out.println("Employee id: " + emp.getEmpId());
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Employee Soc Sec: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());
    }
    
}
