package com.example;

/* Program built to enhance the software to support checking accounts
 *
 * 
 */
public class CheckingAccount extends Account {

    private final double overDraftLimit;

    //Constructor method
    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    //Constructor method
    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }

}
