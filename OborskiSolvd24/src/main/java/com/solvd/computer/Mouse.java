package com.solvd.computer;

import java.util.Objects;

public class Mouse extends Product {
    private int sensitivity;

    public Mouse(String producer, String model, double price, boolean isNew, int sensitivity) {
        super(producer, model, price, isNew);
        this.sensitivity = sensitivity;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        double discount = getPrice() * (discountPercentage / 100);
        return getPrice() - discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensitivity);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "sensitivity=" + sensitivity +
                '}';
    }
}
