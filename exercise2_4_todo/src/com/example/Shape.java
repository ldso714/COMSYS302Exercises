package com.example;

public abstract class Shape {

    // attributes
    protected String colour;

    // constructor
    public Shape() {
        this.colour = "undefined";
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    // methods
    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        colour = newColour;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return "A shape with colour of " + colour;
    }
}