package com.karakays.patterns.accounting;

public interface AccountingCommand {
    public void execute();
    public void unexecute();
}
