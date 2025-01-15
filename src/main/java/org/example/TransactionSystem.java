package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TransactionSystem {
    private Map<Integer, BankAccount> accounts;

    //constructor
    public TransactionSystem(List<BankAccount> accountList){
        accounts = new HashMap<>();
        for(BankAccount account: accountList){
            accounts.put(account.getAccountID(), account);
        }
    }

    //account 1 will transfer money to account 2
    public boolean transferMoney(int  account1_ID, int account2_ID, double amount){
        BankAccount account1 = accounts.get(account1_ID);
        BankAccount account2 = accounts.get(account2_ID);

        // Locking Accounts based on order
        BankAccount lock1 = account1_ID < account2_ID ? account1 : account2;
        BankAccount lock2 = account1_ID < account2_ID ? account2 : account1;

        return true;
    }

}
