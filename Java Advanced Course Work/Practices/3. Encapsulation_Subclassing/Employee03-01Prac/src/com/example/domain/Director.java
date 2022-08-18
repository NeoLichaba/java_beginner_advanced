

package com.example.domain;

/* Program displays inheritance hierachies - base class used as the base class for another derived class
 *
 * 
 */
public class Director extends Manager {
    

    private double budget;                                                      //private field with double value budget

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);                              //super keyword used to refer to fields within the base class
        this.budget = budget;
    }
    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }

}
