package com.karakays.patterns.accounts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CompositeAccount implements Account {
    private List<Account> accounts;
    private Account parent;
    
    public CompositeAccount() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public double balance() {
        return accounts.stream().map(a -> a.balance()).reduce(0d, (a, b) -> a + b);
    }

    @Override
    public Collection<Account> children() {
        return accounts;
    }
    
    @Override
    public void add(Account a) {
        this.accounts.add(a);
        a.parent(this);
    }
    
    @Override
    public void remove(Account a) {
        this.accounts.remove(a);
        a.parent(null);
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
