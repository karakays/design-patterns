package com.karakays.patterns.restrictions;

public class PhoneNumberRestriction implements RestrictionHandler {
    private RestrictionHandler handler;
    
    public RestrictionHandler linkWith(RestrictionHandler next) {
        this.handler = next;
        return next;
    }
    
    @Override
    public RestrictionHandler next() {
        return handler;
    }
    
    @Override
    public boolean handle(RestrictionContext context) {
        System.out.println("Handling PhoneNumberRestriction...");
        if(supports(context) && !isValidPhoneNumber(context.getPhoneNumber())) {
            return false;
        }
        return RestrictionHandler.super.handle(context);
    }
    
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+");
    }
}
