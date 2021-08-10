package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;

public class Main {

    public static void main(String[] args) {
        ClothingItem clothingItem = new ClothingItem();
        clothingItem.setQuantity(4);
        System.out.println(clothingItem.getQuantity());

        ClothingItem clothingItem1 = new ClothingItem(14, 44.3, "", ClothingSize.M);
        System.out.println(clothingItem1.getSize());

        System.out.println(ClothingItem.MAX_QUANTITY);
    }
}