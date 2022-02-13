package com.vlad.oop.solid.open_closed;

import java.time.LocalDateTime;
public class Ground implements Shipping {
    private final LocalDateTime deliveryDate;

    public Ground() {
        this.deliveryDate = LocalDateTime.now().plusDays(4);
    }

    @Override
    public double getCost(Order order) {
        if (order.getTotal() > 100) {
            return 0;
        }
        return (int) (order.getTotalWeight() * 1.5);
    }

    @Override
    public LocalDateTime getDate(Order order) {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "delivered by ground in "+ deliveryDate + " date";
    }
}
