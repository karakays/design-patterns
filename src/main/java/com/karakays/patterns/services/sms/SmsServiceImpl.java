package com.karakays.patterns.services.sms;

import com.karakays.patterns.services.sms.providers.SmsServiceProvider;
import com.karakays.patterns.services.sms.providers.SmsServiceProviderFactory;

public class SmsServiceImpl implements SmsService {
    
    private final SmsServiceProvider provider;
    
    public SmsServiceImpl() {
        this.provider = SmsServiceProviderFactory.createSmsServiceProvider();
    }

    public void sendText(String phoneNumber, String text) {
        provider.sendText(phoneNumber, text);
    }
}
