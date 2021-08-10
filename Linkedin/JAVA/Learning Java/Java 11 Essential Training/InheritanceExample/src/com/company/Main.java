package com.company;

import com.model.ClothingItem;
import com.model.Hat;

public class Main {

    public static void main(String[] args) {
        ClothingItem ci1 = new ClothingItem();
        ClothingItem ci2 = new Hat("hara");
        printInfo(ci1, ci2);
    }

    public static void printInfo(ClothingItem... clothingItems) {
        for (ClothingItem clothingItem : clothingItems) {
            System.out.println("*** Our Item: ***");
            System.out.println('\t' + clothingItem.getType());
            System.out.println('\t' + clothingItem.getMaterial());
        }
    }
}
