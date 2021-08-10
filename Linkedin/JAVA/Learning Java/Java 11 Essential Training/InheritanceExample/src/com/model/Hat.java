package com.model;

public class Hat extends ClothingItem {
    @Override
    public String getType() {
        return "Hat item";
    }

    public String getMaterial() {
        return "polyester material";
    }
}
