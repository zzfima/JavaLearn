package com.company;

import com.model.ClothingItem;
import com.model.Hat;

public class Main {

    public static void main(String[] args) {
        ClothingItem ci1 = new ClothingItem();
        System.out.println(ci1.getType());
        System.out.println(ci1.getMaterial());

        ClothingItem ci2 = new Hat("hara");
        System.out.println(ci2.getType());
        System.out.println(ci2.getMaterial());
    }
}
