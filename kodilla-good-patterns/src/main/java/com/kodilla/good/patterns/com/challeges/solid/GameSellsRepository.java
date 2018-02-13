package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class GameSellsRepository implements SellsRepository{

    private String nameOfTheGame;
    private int numberOfGames;

    public GameSellsRepository(String nameOfTheGame, int numberOfGames) {
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
        System.out.println("Stored Data: " + "\n" + "Sold: " + nameOfTheGame+ " Quantity: " + numberOfGames
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold
                + " date of receiving the money: " + whenGotMoney + " date of shipping the product: " + whenShipped + "\n");
        return true;
    }
}