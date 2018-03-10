package com.karakays.patterns.states;

public class PayWithCardInitialized implements PaymentStateHandler {

    @Override
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        // TODO Auto-generated method stub
        System.out.println("Executing in state " + PaymentState.INIT);
        changeState(strategy, PaymentState.THREE_D_REQUIRED);
    }
}
