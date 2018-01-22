package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        List<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle(5);
        shapes.add(circle);

        //When
        figures.addFigure(circle);

        //Then
        Assert.assertEquals(1, figures.getFigure(1));


    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Shape circle = new Circle(5);
        figures.addFigure(circle);

        //When
        boolean result = figures.removeFigure(circle);

        //Then
        Assert.assertTrue(result);

    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Shape circle = new Circle(5);
        figures.addFigure(circle);

        //When
        Shape try1 = figures.getFigure(0);

        //Then
        Assert.assertEquals(circle, try1);
    }

    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Shape square = new Square(5);

        //When
        figures.showFigure();

        //Then
        Assert.assertEquals(square, figures.showFigure());


    }
}
