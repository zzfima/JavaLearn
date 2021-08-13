package com.company;

public class Customer {
    private final String name;

    public Customer(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void finalize() {
        System.out.println("Finalizer for " + this.name);
    }
}
