package com.kodilla.good.patterns.com.challeges.solid;

public class MailService implements InformationService{

    @Override
    public void inform(BuyerInfo buyerInfo) {

        System.out.println(" Information send to the buyer " + "\n" + " We would like to thank you " + buyerInfo.getFirstName()
                + " " + buyerInfo.getLastName() + " for buying our product: "
                + buyerInfo.getNameOfProduct() + " quantity: "
                + buyerInfo.getQuantity());

    }
}
