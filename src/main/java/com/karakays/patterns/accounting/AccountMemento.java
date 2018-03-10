package com.karakays.patterns.accounting;

public class AccountMemento {
    private double balance;
    
    AccountMemento(Account originator) {
        this.balance = originator.getBalance();
    }
    
    double getBalance() {
        return balance;
    }
}
