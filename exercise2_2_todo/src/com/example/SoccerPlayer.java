package com.example;

class SoccerPlayer extends Player {

    // fields
    private int number;

    // constructor
    public SoccerPlayer(String name, int number) {
        super(name);
        this.number = number;
    }

    // methods
    @Override
    String getNumber() {
        return Integer.toString(number);
    }

    @Override
    void showInformation() {
        super.showInformation();
    }
}