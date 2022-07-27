package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

/* This code stores data on the amount of shares held by employees per designation
 *
 *
 */
public class EmployeeStockPlan {

    //fields defining stock levels
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public int grantStock(Employee emp) {
        // Stock is granted based on the employee type 
        if (emp instanceof Director) {
            return directorShares;
        } else {
            if (emp instanceof Manager) {
                return managerShares;
            } else {
                return employeeShares;
            }
        }

    }
}
