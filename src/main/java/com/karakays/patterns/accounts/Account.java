package com.karakays.patterns.accounts;

import java.util.Collection;
import java.util.Collections;

public interface Account {
    double balance();
    Account parent();
    void parent(Account parent);
    // No children by default
    default Collection<Account> children() {return Collections.EMPTY_LIST;}
    // Fail by default
    default void add(Account a) {throw new UnsupportedOperationException();}
    // Fail by default
    default void remove(Account a) {throw new UnsupportedOperationException();}
}
