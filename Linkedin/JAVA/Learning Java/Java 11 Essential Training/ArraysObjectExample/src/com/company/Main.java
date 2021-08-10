package com.company;

import com.model.ClothingItem;
import com.model.Hat;
import com.model.Shirt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Array using
        ClothingItem[] itemsArray = {
                new Hat("big"),
                new Shirt("small")
        };
        getInfo(itemsArray);

        List<ClothingItem> itemsList = new ArrayList<ClothingItem>();
        itemsList.add(itemsArray[0]);
        itemsList.add(itemsArray[1]);
        getInfo(itemsList.toArray(itemsArray));
    }

    public static void getInfo(ClothingItem... items) {
        for (ClothingItem item : items
        ) {
            System.out.println("*** Our Item: ***");
            System.out.println('\t' + item.getType());
            System.out.println('\t' + item.getMaterial());
        }
    }
}
