package com.solvd.computer;

import java.util.Objects;

public class PCMonitor extends Product {
        private String resolution;
        private boolean isCurved;

    public PCMonitor(String producer, String model, double price, boolean isNew, String resolution, boolean isCurved) {
        super(producer, model, price, isNew);
        this.resolution = resolution;
        this.isCurved = isCurved;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        double discount = getPrice() * (discountPercentage / 100);
        return getPrice() - discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, isCurved);
    }

    @Override
    public String toString() {
        return "PCMonitor{" +
                "resolution='" + resolution + '\'' +
                ", isCurved=" + isCurved +
                '}';
    }
}

