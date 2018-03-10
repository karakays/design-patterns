package com.karakays.patterns.states;

public enum PaymentState {
    INIT(new PayWithCardInitialized()),
    PENDING(new PayWithCardPending()),
    THREE_D_REQUIRED(new PayWithCard3dRequired()),
    THREE_D_APPROVED(new PayWithCard3dApproved()),
    FAILED(null),
    COMPLETED(new PayWithCardCompleted());
    
    private PaymentStateHandler handler;
    
    private PaymentState(PaymentStateHandler handler) {
        this.handler = handler;
    }
    
    public void handle(TransactionContext context, PayWithCardStrategy strategy) {
        handler.handle(context, strategy);
    }
}
