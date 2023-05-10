package com.example;

public class Circle extends Shape {

    // attributes
    private double radius;

    // constructors
     public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    // getters & setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // methods
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "A circle with radius of " + radius + " and colour of " + colour;
    }
}