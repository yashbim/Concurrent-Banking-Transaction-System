package org.example;
// Find source code at https://github.com/yashbim/Concurrent-Banking-Transaction-System

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  Main {
    public static void main(String[] args) {

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

        System.out.println("\n Initial Account Details:");
        transactionSystem.printAccounts();

        // start

        t1.start();
        t2.start();
        t3.start();

        // add join functions
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print account details after running

        System.out.println("\nFinal Account Details:");
        transactionSystem.printAccounts();

        System.out.println("Reversing transactions");
        transactionSystem.rollbackTransaction(2,1,10000);
        transactionSystem.rollbackTransaction(3,2,20000);
        transactionSystem.rollbackTransaction(1,3,5000);
        transactionSystem.printAccounts();

    }
}