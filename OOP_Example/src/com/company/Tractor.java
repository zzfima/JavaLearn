package com.company;

public class Tractor extends BaseCar {
    @Override
    public String GetName() {
        return "I am Tractor, son of the " + super.GetBaseName();
    }
}
