package com.karakays.patterns.states;

public class PayWithCard3dRequired implements PaymentStateHandler {


    @Override
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        // TODO Auto-generated method stub
        System.out.println("Executing in state " + PaymentState.THREE_D_REQUIRED);
        changeState(strategy, PaymentState.THREE_D_APPROVED);
    }
}
