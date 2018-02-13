package com.kodilla.good.patterns.com.challeges;

public class MailSandalsService implements InformationService{

    private String emailAddress;

    public MailSandalsService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void inform(User user) {

        System.out.println("Sent notification after the purchase to: "
                +user.getName() + " " + user.getLastName() + " Email: " + emailAddress + "\n");

    }
}