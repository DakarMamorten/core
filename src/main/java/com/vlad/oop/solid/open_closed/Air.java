package com.vlad.oop.solid.open_closed;

import java.time.LocalDateTime;
public class Air implements Shipping {
    private final LocalDateTime deliveryDate;

    public Air() {
        this.deliveryDate = LocalDateTime.now().plusDays(2);
    }

    @Override
    public double getCost(Order order) {
        return 0;
    }

    @Override
    public LocalDateTime getDate(Order order) {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "delivered by air in "+ deliveryDate + " date";
    }
}
