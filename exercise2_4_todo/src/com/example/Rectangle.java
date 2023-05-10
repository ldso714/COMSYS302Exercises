package com.example;

public class Rectangle extends Shape {

    // attributes
    private double width;
    private double length;

    // constructor
    public Rectangle(double width, double length, String colour) {
        this.width = width;
        this.length = length;
        this.colour = colour;
    }

    // getters & setters
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    // methods
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width of " + width + " and length of " + length + ", and colour of " + colour;
    }
}