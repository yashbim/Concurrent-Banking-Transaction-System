package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TransactionSystem {
    private Map<Integer, BankAccount> accounts;

    public TransactionSystem(List<BankAccount> accountList){
        accounts = new HashMap<>();
        for(BankAccount account: accountList){
            accounts.put(account.getAccountID(), account);
        }
    }

}
