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

}

