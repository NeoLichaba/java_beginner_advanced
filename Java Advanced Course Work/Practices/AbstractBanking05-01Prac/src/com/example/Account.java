package com.example;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }
    
    //abstract methods
    public abstract boolean withdraw(double amount);
    
    public String getDescription(){
        return "Checking Account";
    }
    
}