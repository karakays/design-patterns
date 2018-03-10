package com.karakays.patterns.accounting;

public class Account {
    private final long customerId;
    private double balance;
    
    public Account(long customerId, double balance) {
        this.customerId = customerId;
        this.balance =  balance;
    }
    
    public Account(long customerId) {
        this(customerId, 0d);
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }
    
    public AccountMemento createMemento() {
        return new AccountMemento(this);
    }
    
    public void setMemento(AccountMemento memento) {
        this.balance = memento.getBalance();
    }
}
