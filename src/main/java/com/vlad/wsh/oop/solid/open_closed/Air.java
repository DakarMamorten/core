package com.vlad.wsh.oop.solid.open_closed;

public class Air implements Shipping {
    @Override
    public int getCost(Order order) {
        return 0;
    }

    @Override
    public int getDate(Order order) {
        return 0;
    }
}
