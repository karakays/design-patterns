package com.karakays.patterns.events;

public class EventTypeResolver implements EventResourceVisitor {
    private EventType type;
    
    public EventType getType() {
        return type;
    }

    @Override
    public EventType visit(Instruction instruction) {
        return null;
    }

    @Override
    public EventType visit(MoneyMovement move) {
        return null;
    }
}
