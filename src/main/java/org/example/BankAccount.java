package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int accountID;
    private double balance;
    private ReentrantLock reentrantLock;
}
