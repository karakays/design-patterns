package com.karakays.patterns.services.sms.providers;

public class AwsSmsServiceImpl implements SmsServiceProvider {

    public void sendText(String phoneNumber, String text) {
        System.out.println("AWS sending sms");
    }
}
