package com.model;

public class ClothingItem {
    private String size;

    public ClothingItem(){
        this.size = "";
    }

    public ClothingItem(String size) {
        this.size = size;
    }

    public String getType() {
        return "Clothing Item";
    }

    public String getMaterial() {
        return "abstract material";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
