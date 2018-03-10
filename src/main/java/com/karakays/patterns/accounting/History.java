package com.karakays.patterns.accounting;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class History {
    private final List<AccountingCommand> history;
    private int cursor;

    public History() {
        this.history = new LinkedList<>();
        this.cursor = 0;
    }
    
    public void push(AccountingCommand command) {
        history.add(cursor++, command);
    }
    
    public Optional<AccountingCommand> forward() {
        AccountingCommand command = null;
        if(cursor < history.size()) {
            command = history.get(cursor++);
        }
        return Optional.ofNullable(command);
    }
    
    public Optional<AccountingCommand> backward() {
        AccountingCommand command = null;
        if(cursor > 0) {
            command = history.get(--cursor);
        }
        return Optional.ofNullable(command);
    }
}
