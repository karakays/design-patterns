package com.karakays.patterns.accounting;

public class AccountingService {
    
    private final History history;
    
    public AccountingService() {
        this.history = new History();
    }

    public void execute(AccountingCommand command) {
        history.push(command);
        command.execute();
    }
    
    public void undo() {
        history.backward().ifPresent(c -> c.unexecute());
    }
    
    public void redo() {
        history.forward().ifPresent(c -> c.execute());
    }
}
