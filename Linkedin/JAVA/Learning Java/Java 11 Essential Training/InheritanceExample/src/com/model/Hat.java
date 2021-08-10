package com.model;

public class Hat extends ClothingItem {

    public Hat(String size) {
        super(size);
    }

    @Override
    public String getType() {
        return "Hat item";
    }

    public String getMaterial() {
        return "polyester material";
    }
}
