package com.kodilla.good.patterns.com.challeges.solid;

public class MailSandalsService implements InformationService{

    @Override
    public void inform(User user) {

        System.out.println("Sent notification after the purchase to: "
                +user.getName() + " " + user.getLastName() + " Email: " + user.getEmail() + "\n");

    }
}