package com.company;

import java.util.ArrayList;

public class Account {
    private String AccountName;
    private int balance=0;
    private ArrayList<Integer> transactions;

    public Account(String AccountName) {
        this.AccountName = AccountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(amount+"desposited . Balance is now "+ this.balance);
        }
    }
}
