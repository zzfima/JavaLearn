package com.company;

public class Square {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int calculateArea() {
        return this.length * this.length;
    }
}

