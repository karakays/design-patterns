package com.karakays.patterns.states;

public class PayWithCardPending implements PaymentStateHandler {

    @Override
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        // TODO Auto-generated method stub
        System.out.println("Executing in state " + PaymentState.PENDING);
        changeState(strategy, PaymentState.COMPLETED);
    }
}
