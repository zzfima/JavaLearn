package com.company.model;

public class ClothingItem {
    public static final int MAX_QUANTITY = 40;
    
    //Fields
    private final double price;
    private final String type;
    private int quantity;
    private ClothingSize size;

    //constructors
    public ClothingItem() {
        this.quantity = 0;
        this.price = 0D;
        this.type = "";
        this.size = ClothingSize.S;
    }

    public ClothingItem(int quantity, double price, String type, ClothingSize size) {
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

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
