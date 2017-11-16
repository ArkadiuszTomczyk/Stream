package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getShape(int index) {
        return shapes.get(index);
    }
    public void showShapes() {
        for(Shape shape: shapes) {
            System.out.println(shape);
        }
    }
    public int getSize() {
        return shapes.size();
    }
}
