package com.karakays.patterns.restrictions;

import com.karakays.patterns.restrictions.RestrictionContext.Type;

public class LimitRestriction implements RestrictionHandler {
    private RestrictionHandler handler;
    private final int limit;
    
    public LimitRestriction(int limit) {
        this.limit = limit;
    }
    
    public RestrictionHandler linkWith(RestrictionHandler next) {
        this.handler = next;
        return next;
    }
    
    @Override
    public RestrictionHandler next() {
        return handler;
    }
    
    @Override
    public boolean supports(RestrictionContext context) {
        return context.getType() == Type.WITHDRAW;
    }
    
    @Override
    public boolean handle(RestrictionContext context) {
        System.out.println("Handling LimitRestriction...");
        if(supports(context) && context.getAmount() > limit) {
            return false;
        }
        return RestrictionHandler.super.handle(context);
    }
}
