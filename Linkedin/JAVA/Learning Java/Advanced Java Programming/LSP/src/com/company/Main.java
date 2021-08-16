package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Building office = new Office();

        printBuilding(building);
        printBuilding(office);

        List<Building> buildings1 = new ArrayList<>();
        buildings1.add(new Building());
        buildings1.add(new Office());
        printBuildings1(buildings1);

        List<Office> buildings2 = new ArrayList<>();
        buildings2.add(new Office());
        buildings2.add(new Office());
        //printBuildings1(buildings2);
        printBuildings2(buildings2);
    }

    private static void printBuilding(Building building) {
        System.out.println(building);
    }

    private static void printBuildings1(List<Building> buildings) {
        for (Building b : buildings)
            System.out.println(b);
    }

    private static void printBuildings2(List<? extends Building> buildings) {
        for (Building b : buildings)
            System.out.println(b);
    }
}
