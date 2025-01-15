package org.example;
// Find source code at https://github.com/yashbim/Concurrent-Banking-Transaction-System

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //creating bank accounts

        List<BankAccount> bankAccounts = Arrays.asList(
            new BankAccount(1, 100000),
            new BankAccount(2, 50000),
            new BankAccount(3, 25000));

        // initializing transaction systems
        TransactionSystem transactionSystem = new TransactionSystem(bankAccounts);

        //Transaction threads
        Thread t1 = new Thread(new TransactionThread(transactionSystem, 1, 2, 10000));
        Thread t2 = new Thread(new TransactionThread(transactionSystem, 2, 3, 20000));
        Thread t3 = new Thread(new TransactionThread(transactionSystem, 3, 1, 5000));

        // print initial account details
        
        System.out.println("Initial Account Details:");
        transactionSystem.printAccounts();

        // start

        t1.start();
        t2.start();
        t3.start();

    }
}