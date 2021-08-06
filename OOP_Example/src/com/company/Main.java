package com.company;

public class Main {

    public static void main(String[] args) {
        IFigure f1 = new Circle();
        System.out.println(f1.GetName());

        BaseCar c1 = new Tractor();
        System.out.println(c1.GetName());
    }
}
