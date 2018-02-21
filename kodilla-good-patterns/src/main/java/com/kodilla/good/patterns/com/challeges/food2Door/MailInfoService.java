package com.kodilla.good.patterns.com.challeges.food2Door;

public class MailInfoService implements InformationService {

    @Override
    public void inform(Order order) {
        System.out.println(" We are sending this email to Thank you for placing order " + order);
    }
}
