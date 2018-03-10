package com.karakays.patterns.restrictions;

public interface RestrictionHandler {
    
    RestrictionHandler next();
    
    RestrictionHandler linkWith(RestrictionHandler handler);
    
    default boolean supports(RestrictionContext context) {
        return true;
    }

    default boolean handle(RestrictionContext context) {
        return (next() != null) ? next().handle(context) : true;
    }
}
