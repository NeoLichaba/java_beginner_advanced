

package com.example.domain;

/**
 *
 * @author User
 */
public class Director extends Manager {
    

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }
    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }

}
