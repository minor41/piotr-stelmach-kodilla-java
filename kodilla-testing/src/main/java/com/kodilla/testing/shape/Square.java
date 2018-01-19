package com.kodilla.testing.shape;

public class Square implements Shape{
    String square;
    int a;

    public Square(String square, int a) {
        this.square = square;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "square";

    }

    @Override
    public double getField() {

       return a * a;

    }
}
