package org.example;

public class TransactionThread implements Runnable{
    private TransactionSystem transactionSystem;
    private int account1_ID;
    private int account2_ID;
    private double amount;

    public TransactionThread(TransactionSystem transactionSystem, int account1_ID, int account2_ID, double amount){
        this.transactionSystem = transactionSystem;
        this.account1_ID = account1_ID;
        this.account2_ID = account2_ID;
        this.amount = amount;
    }

    @Override
    public void run() {
        //success to conduct transaction
        boolean success = transactionSystem.transferMoney(account1_ID, account2_ID, amount);
        
        if (success){
                System.out.println("Thread " + Thread.currentThread().getName() +
                " successfully transfered " + amount +
                " from " + account1_ID +
                " to " + account2_ID);
        } else {
            System.out.println("Thread " + Thread.currentThread().getName() + "Transaction Failed");
        }

    }
}
