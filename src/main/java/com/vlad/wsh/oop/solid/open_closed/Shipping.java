package com.vlad.wsh.oop.solid.open_closed;

public interface Shipping {
    int getCost(Order order);

    int getDate(Order order);
}
