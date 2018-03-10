package com.karakays.patterns.restrictions;

public class NoRestriction implements RestrictionHandler {

    private RestrictionHandler handler;
    
    public RestrictionHandler linkWith(RestrictionHandler next) {
        this.handler = next;
        return next;
    }
    
    @Override
    public RestrictionHandler next() {
        return handler;
    }
}
