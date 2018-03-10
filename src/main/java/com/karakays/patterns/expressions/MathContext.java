package com.karakays.patterns.expressions;

import java.util.HashMap;
import java.util.Map;

public class MathContext {
    private final Map<String, Integer> variables = new HashMap<>();

    public int lookup(String var) {
        return variables.get(var);
    }
    
    public void assign(String var, int n) {
       variables.put(var, n); 
    }
}
