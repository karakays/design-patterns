package com.karakays.patterns.events;

public interface EventResourceVisitor extends Visitor<EventType> {
    EventType visit(Instruction instruction);
    EventType visit(MoneyMovement move);
}
