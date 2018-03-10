package com.karakays.patterns.states;

public class PayWithCardStrategy extends BaseStrategy {
    private PaymentState state;
    
    public PayWithCardStrategy() {
        state = PaymentState.INIT;
    }
    
    public void doProcess(TransactionContext context) {
        state.handle(context, this);
    }
    
    public void changeState(PaymentState state) {
        this.state = state;
    }
}
