package com.karakays.patterns.services.sms.providers;

public class TwilioSmsServiceImpl implements SmsServiceProvider {

    public void sendText(String phoneNumber, String text) {
        System.out.println("Twilio sending sms");
    }
}
