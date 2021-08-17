package com.company;

public record SquareRec(int length) {
    public int calculateArea() {
        return this.length * this.length;
    }
}