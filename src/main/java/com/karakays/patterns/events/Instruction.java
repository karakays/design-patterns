package com.karakays.patterns.events;

public class Instruction implements Resource {

    @Override
    public void accept(Visitor<?> visitor) {
        visitor.visit(this);
    }
}
