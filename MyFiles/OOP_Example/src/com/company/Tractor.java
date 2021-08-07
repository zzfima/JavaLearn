package com.company;

public class Tractor extends BaseCar {
    int _mass;

    private Tractor() {
    }

    public Tractor(int mass) {
        _mass = mass;
    }

    @Override
    public String GetName() {
        return "I am Tractor, son of the " + super.GetBaseName() + ", my mass is: " + _mass;
    }
}
