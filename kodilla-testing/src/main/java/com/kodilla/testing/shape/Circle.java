package com.kodilla.testing.shape;

public class Circle implements Shape{
    String circle;
    int r;

    public Circle(String circle, int r) {
        this.circle = circle;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * (r * r);

    }
}
