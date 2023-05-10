package com.example;

class BasketballPlayer extends Player {

    // fields
    private int number;
    private String position;

    //constructor
    public BasketballPlayer(String name, int number, String position) {
        super(name);
        this.number = number;
        this.position = position;
    }

    // methods
    String getPosition() {
        return position;
    }

    @Override
    String getNumber() {
        return Integer.toString(number);
    }

    @Override
    void showInformation() {
        super.showInformation();
        System.out.println("The position is " + getPosition() + ".");
    }
}