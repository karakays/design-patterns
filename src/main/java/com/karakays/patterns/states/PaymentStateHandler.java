package com.karakays.patterns.states;

public interface PaymentStateHandler {
    void handle(TransactionContext context, PayWithCardStrategy strategy);
    
    default public void changeState(PayWithCardStrategy strategy, PaymentState state) {
        strategy.changeState(state);
    }
}
