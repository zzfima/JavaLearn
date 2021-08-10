package com.company.model;

public class ClothingItem {
    //Fields
    private final double price;
    private final String type;
    private int quantity;
    private String size;

    //constructors
    public ClothingItem() {
        this.quantity = 0;
        this.price = 0D;
        this.type = "";
        this.size = "";
    }

    public ClothingItem(int quantity, double price, String type, String size) {
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.size = size;
    }

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

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
