package com.karakays.patterns.states;

public class PayWithCardCompleted implements PaymentStateHandler {

    @Override
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        // NOOP
        System.out.println("Executing in state " + PaymentState.COMPLETED);
    }
}
