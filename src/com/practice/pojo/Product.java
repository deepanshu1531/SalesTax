package com.practice.pojo;

public class Product {
    private String name;
    private double price;
    private boolean isExempted;
    private boolean isImported;

    public Product(String name, double price, boolean isExempted, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isExempted = isExempted;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExempted() {
        return isExempted;
    }

    public boolean isImported() {
        return isImported;
    }
}
