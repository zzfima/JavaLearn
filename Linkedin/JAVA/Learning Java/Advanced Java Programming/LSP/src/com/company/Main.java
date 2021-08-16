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
        printBuildings(buildings1);

        List<Office> buildings2 = new ArrayList<>();
        buildings2.add(new Office());
        buildings2.add(new Office());
        printBuildings(buildings2);
    }

    private static void printBuilding(Building building) {
        System.out.println(building);
    }

    private static void printBuildings(List<Building> buildings) {
        for (Building b : buildings)
            System.out.println(b);
    }
}
