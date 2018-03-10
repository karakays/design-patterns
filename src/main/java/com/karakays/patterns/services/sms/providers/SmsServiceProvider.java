package com.karakays.patterns.services.sms.providers;

public interface SmsServiceProvider {
    public void sendText(String phoneNumber, String text);
}
