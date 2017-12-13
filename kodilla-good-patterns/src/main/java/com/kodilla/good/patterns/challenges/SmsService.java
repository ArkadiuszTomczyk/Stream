package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    @Override
    public boolean inform() {
        System.out.println("Sending sms");
        return true;
    }
}
