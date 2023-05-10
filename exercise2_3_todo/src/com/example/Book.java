package com.example;

abstract class Book {

    // fields
    String title;

    // methods
    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}