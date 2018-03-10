package com.karakays.patterns.accounting;

public class AccountingPostCommand implements AccountingCommand {
    private double amount;
    private Account source;
    private Account destination;
    private AccountMemento sourcememento;
    private AccountMemento destinationMemento;
    
    public AccountingPostCommand(double amount, Account source, Account destination) {
        this.amount = amount;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void execute() {
        sourcememento = source.createMemento();
        destinationMemento = destination.createMemento();
        source.setBalance(source.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);
    }

    @Override
    public void unexecute() {
        source.setMemento(sourcememento);
        destination.setMemento(destinationMemento);
    }
}
