package com.karakays.patterns.services.sms.providers;

public class InfobipSmsServiceImpl implements SmsServiceProvider {

    public void sendText(String phoneNumber, String text) {
        System.out.println("Infobip sending sms");
    }
}
