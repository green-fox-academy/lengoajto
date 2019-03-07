package com.greenfoxacademy.webshop.Models;

public class ShopItems {

    private String name;
    private String description;
    private int price;
    private int quantity;

    public ShopItems(String name, String description, int price, int quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
