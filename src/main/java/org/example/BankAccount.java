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

    public int getAccountID(){
        return accountID;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void depositMoney(double amount){} //complete function later
    public void withdrawMoney(double amount){} //complete function later
    public void transferMoney(double amount){} //complete function later

    public void lock(){
        reentrantLock.lock();
    }
    public void unlock(){
        reentrantLock.unlock();
    }

}

