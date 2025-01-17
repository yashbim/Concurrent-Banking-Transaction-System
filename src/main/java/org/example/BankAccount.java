package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int id;
    private double balance;
    private ReentrantLock lock;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public void depositMoney(double amount){
        balance += amount;
    }
    
    public void withdrawMoney(double amount){
        balance -= amount;
    }

    public void lock(){
        lock.lock();
    }

    public void unlock(){
        lock.unlock();
    }

}

