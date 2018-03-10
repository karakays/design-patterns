package com.karakays.patterns.services.sms;

public interface SmsService {
    
    public void sendText(String phoneNumber, String text);
}
