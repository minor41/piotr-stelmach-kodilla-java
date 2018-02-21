package com.kodilla.good.patterns.com.challeges.food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {

        final InformationService mailInfoService = new MailInfoService();
        final InformationService textInfoService = new TextMessageInfoService();
        final Food2Door food2Door = new Food2Door();
        food2Door.registerNewProducer(new ExtraFoodShop(mailInfoService));
        food2Door.registerNewProducer(new HealthyShop(textInfoService));
        food2Door.registerNewProducer(new GlutenFreeShop(mailInfoService));

        food2Door.placeOrder(new Order("BioSkin Products"));
        food2Door.placeOrder(new Order("Dairy Products"));
        food2Door.placeOrder(new Order("GlutenFree Pasta"));

    }
}

