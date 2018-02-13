package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class GamesSellsService implements SellsService{

    private String nameOfTheGame;
    private int numberOfGames;

    public GamesSellsService(String nameOfTheGame, int numberOfGames) {
        this.nameOfTheGame = nameOfTheGame;
        this.numberOfGames = numberOfGames;
    }

    public String getNameOfTheGame() {
        return nameOfTheGame;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    @Override
    public boolean createSells(User user, LocalDate whenSold, LocalDate whenGotMoney, LocalDate whenShipped) {
        System.out.println("Sold: " + getNameOfTheGame()+ " Quantity: " + getNumberOfGames()
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold.toString()
        + " date of receiving the money: " + whenGotMoney.toString() + " date of shipping the product: "
                + whenShipped.toString());
        return true;
    }
}
