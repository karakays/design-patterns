package com.karakays.patterns.processor;

public class EventProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("EventProcessor doing some fancy work...");
    }

}
