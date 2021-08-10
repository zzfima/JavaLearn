package com.company.model;

public class ClothingItem {
    //Fields
    private int quantity;
    private double price;
    private String type;
    private String size;

    //Methods
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
