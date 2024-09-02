package com.solvd.computer;

public abstract class Product {
    private String producer;
    private String model;
    private double price;
    private boolean isNew;

    public Product(String producer, String model, double price, boolean isNew) {
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.isNew = isNew;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public abstract double calculateDiscountedPrice(double discountPercentage);
}