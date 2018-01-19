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
        Circle circle = new Circle("circle", 5);
        Square square = new Square("square", 5);
        Triangle triangle = new Triangle("triangle", 3,5);
        ShapeCollector figures = new ShapeCollector();

        //When
        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);

        //Then
        Assert.assertEquals(1, figures.addFigure(circle));


    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle("circle", 5);
        Square square = new Square("square", 5);
        Triangle triangle = new Triangle("triangle", 3,5);

        //When
        boolean result = figures.removeFigure(circle);
        boolean result2 = figures.removeFigure(square);
        boolean result3 = figures.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Shape circle = new Circle("circle", + 5);

        //When
        Shape result = figures.getFigure(1);

        //Then
        Assert.assertEquals(circle, result);
    }

    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector figures = new ShapeCollector();
        Shape square = new Square("square", 5);

        //When
        figures.showFigure();

        //Then
        Assert.assertEquals(square, figures.showFigure());


    }
}
