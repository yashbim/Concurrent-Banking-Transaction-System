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
    }
}