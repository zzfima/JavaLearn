package com.company;

import com.model.ClothingItem;
import com.model.Hat;
import com.model.Shirt;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Array using
        ClothingItem[] itemsArray = {
                new Hat("big"),
                new Shirt("small")
        };
        getInfo(itemsArray);

        List<ClothingItem> itemsList = new ArrayList();
        itemsList.add(itemsArray[0]);
        itemsList.add(itemsArray[1]);
        getInfo(itemsList.toArray(itemsArray));
        System.out.println(itemsList.get(0).getType());

        Map<String, ClothingItem> itemsMap = new HashMap();
        itemsMap.put("first", itemsArray[0]);
        itemsMap.put("second", itemsArray[1]);
        Set<String> keys = itemsMap.keySet();
        for (String key : keys) {
            System.out.println(itemsMap.get(key).getType());
        }
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
