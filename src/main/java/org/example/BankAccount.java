package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int accountID;
    private double accountBalance;
    private ReentrantLock reentrantLock;

    public BankAccount(int accountID, double balance) {
        this.accountID = accountID;
        this.accountBalance = balance;
        this.reentrantLock = new ReentrantLock();
    }

    public int getID(){
        return accountID;
    }

    public double getBalance(){
        return accountBalance;
    }

    public void deposit(double amount){} //complete function later
    public void withdraw(double amount){} //complete function later
    public void transfer(double amount){} //complete function later

    public void lock(){
        reentrantLock.lock();
    }
    public void unlock(){
        reentrantLock.unlock();
    }

}

