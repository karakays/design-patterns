package com.karakays.patterns.events;

public interface Resource {
    void accept(Visitor<?> visitor);
}
