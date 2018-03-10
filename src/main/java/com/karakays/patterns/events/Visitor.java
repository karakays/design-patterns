package com.karakays.patterns.events;

public interface Visitor<R> {
    R visit(Instruction instruction);
    R visit(MoneyMovement move);
}
