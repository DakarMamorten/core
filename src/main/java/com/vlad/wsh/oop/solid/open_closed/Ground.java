package com.vlad.wsh.oop.solid.open_closed;

public class Ground implements Shipping {
    @Override
    public int getCost(Order order) {
        int max = 0;
        if (order.getTotal() > 100) {
            return 0;
        }
        return (int) (order.getTotalWeight() * 1.5);
    }

    @Override
    public int getDate(Order order) {
        return 0;
    }
}
