package com.karakays.patterns.accounts;

public class SingleAccount implements Account {
    private double balance;
    private Account parent;
    
    public SingleAccount(double balance) {
        this.balance =  balance;
    }
    
    public SingleAccount() {
        this(0d);
    }

    @Override
    public double balance() {
        return balance;
    }

    @Override
    public Account parent() {
        return this.parent;
    }

    @Override
    public void parent(Account parent) {
        this.parent = parent;
    }
}
