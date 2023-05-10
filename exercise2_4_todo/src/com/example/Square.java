package com.example;

public class Square extends Rectangle {

    // attributes
    private double side;

    // constructor
    public Square(double side, String colour) {
        super(side, side, colour);
        this.side = side;
    }

    // getters & setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // methods
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A square with side of " + side + " and colour of " + colour;
    }
}