package com.company;

public class Customer {
    private boolean isServed;
    private String name;

    public Customer(String name) {
        this.isServed = false;
        this.name = name;
    }

    public void serve() {
        this.isServed = true;
        System.out.println("Serving " + this.name + "...");
    }

    @Override
    public String toString() {
        return this.name + " is " + (this.isServed ? "served" : "not served");
    }
}
