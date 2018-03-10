package com.karakays.patterns.processor;

public class PerformanceLoggerProcessor implements Processor {
    private final Processor delegate;
    
    public PerformanceLoggerProcessor(Processor processor) {
        this.delegate = processor;
    }

    @Override
    public void process() {
        long start = System.currentTimeMillis();
        delegate.process();
        System.out.printf("Process took %s (ms)", System.currentTimeMillis() - start);
    }
}
