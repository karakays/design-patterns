package com.karakays.patterns.restrictions;

public class CountryRestriction implements RestrictionHandler {
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
        System.out.println("Handling CountryRestriction...");
        if(supports(context) && !context.getCountryCode().equals("DE")) {
            return false;
        }
        return RestrictionHandler.super.handle(context);
    }
}
