package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double width;
    private double height;

    public Triangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return width*height/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name ='" + name + '\'' +
                ", width = " + width +
                ", heigh t= " + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.width, width) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
