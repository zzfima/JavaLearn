package com.company;

public abstract class BaseCar {
    public static String GetZero() {
        return "Zero";
    }

    public abstract String GetName();

    protected String GetBaseName() {
        return "BaseCar";
    }
}
