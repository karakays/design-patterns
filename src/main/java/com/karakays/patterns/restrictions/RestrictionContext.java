package com.karakays.patterns.restrictions;

public class RestrictionContext {
    private final int amount;
    private final String countryCode;
    private final String phoneNumber;
    private final Type type;

    public RestrictionContext(Type type, int amount, String countryCode, String phoneNumber) {
        this.type = type;
        this.amount = amount;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public Type getType() {
        return type;
    }
    
    public static enum Type{
        DEPOSIT, WITHDRAW, PAYMENT, SEND;
    }
}
