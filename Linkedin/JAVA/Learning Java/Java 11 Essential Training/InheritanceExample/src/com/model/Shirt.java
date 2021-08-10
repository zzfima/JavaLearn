package com.model;

public class Shirt extends ClothingItem {

    public Shirt(String size) {
        super(size);
    }

    @Override
    public String getType() {
        return "Shirt item";
    }

    public String getMaterial() {
        return "Cotton material";
    }
}
