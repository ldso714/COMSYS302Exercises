package com.example;

public class Player {

    // fields
    private String name;

    // constructor
    public Player(String name) {
        this.name = name;
    }

    // methods
    String getName() {
        return name;
    }

    String getNumber() {
        return "undefined";
    }

    void showInformation() {
        System.out.print("\n");
        System.out.println(getName() + " is a genetic player.");
        System.out.println("The number is " + getNumber() + ".");
    }
}