package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testQuantityOfUsers() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle obj1 = new Circle("koło", 5);
        Triangle obj3 = new Triangle("trójkąt", 15, 47);
        Square obj4 = new Square("kwadrat", 15);
        //When
        shapeCollector.addShape(obj1);
        shapeCollector.addShape(obj3);
        shapeCollector.addShape(obj4);
        Shape obj2 = shapeCollector.getShape(0);
        //Then
        Assert.assertEquals(obj1, obj2);
        shapeCollector.showShapes();
    }

    @Test
    public void testQuantityOfPosts() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle obj1 = new Circle("koło", 5);
        shapeCollector.addShape(obj1);
        //When
        shapeCollector.removeShape(obj1);
        //Then
        Assert.assertEquals(0, shapeCollector.getSize());
        shapeCollector.showShapes();
    }
}