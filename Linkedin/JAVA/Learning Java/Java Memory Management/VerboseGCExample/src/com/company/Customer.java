package com.company;

public class Customer {
    private final String name;
    private int id;

    public Customer(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return this.id + " : " + this.name;
    }
}