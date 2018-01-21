package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        Shape circle = new Circle(5);
        shapes.add(circle);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
           Shape figureCount = null;
           if (n >= 0 && n < shapes.size()) {
               figureCount = shapes.get(n);
           }
           return figureCount;
    }

    public Shape showFigure(){
        return null;
    }
}
