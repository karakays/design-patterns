package com.karakays.patterns.states;

import java.util.Random;

public class PayWithCard3dApproved implements PaymentStateHandler {
    private final Random random = new Random();
    

    @Override
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        // TODO Auto-generated method stub
        System.out.println("Executing in state " + PaymentState.THREE_D_APPROVED);
        
        if(random.nextInt(10) > 5) {
            changeState(strategy, PaymentState.PENDING);
        } else {
            changeState(strategy, PaymentState.FAILED);
        }
    }
}
