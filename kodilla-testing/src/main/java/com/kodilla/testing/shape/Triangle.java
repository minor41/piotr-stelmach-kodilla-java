package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String triangle;
    int a;
    int h;

    public Triangle(String triangle, int a, int h) {
        this.triangle = triangle;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "triangle";

    }

    @Override
    public double getField() {
        return 0.5 * a * h;

    }
}
