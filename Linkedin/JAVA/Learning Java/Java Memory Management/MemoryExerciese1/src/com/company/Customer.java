package com.company;

public class Customer {
    String name;

    public Customer() {
        this.name = "Kolya";
    }

    public String getName() {
        String temp = this.name;
        this.name = this.name + "_X";
        return temp;
    }
}
