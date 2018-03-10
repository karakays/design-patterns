package com.karakays.patterns.services.sms.providers;

public class SmsServiceProviderFactory {
    
    private final static String providerProperty = "infobip";

    public static SmsServiceProvider createSmsServiceProvider() {
        SmsServiceProvider  provider;
        switch(providerProperty) {
        case "infobip":
            provider = new InfobipSmsServiceImpl(); 
            break;
        case "aws":
            provider = new AwsSmsServiceImpl();
            break;
        case "twilio":
            provider = new TwilioSmsServiceImpl();
            break;
        default:
            provider = new InfobipSmsServiceImpl(); 
            break;
        }
        
        return provider;
    }
}
