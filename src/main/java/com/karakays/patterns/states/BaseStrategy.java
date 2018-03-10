package com.karakays.patterns.states;

abstract public class BaseStrategy {
    
    abstract void doProcess(TransactionContext context);
    
    public final void process(TransactionContext context) {
        if(preProcess(context)) {
            doProcess(context);
        }

        postProcess(context);
    }
    
    public boolean preProcess(TransactionContext context) {
        // NOOP by default
        return true;
    }
    
    public void postProcess(TransactionContext context) {
        // NOOP by default
    }
}
