package com.karakays.patterns.events;

public class MoneyMovement implements Resource {

    @Override
    public void accept(Visitor<?> visitor) {
        visitor.visit(this);
    }
}
