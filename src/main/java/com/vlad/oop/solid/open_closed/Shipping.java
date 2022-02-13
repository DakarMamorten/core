package com.vlad.oop.solid.open_closed;

import java.time.LocalDateTime;

public interface Shipping {
    double getCost(Order order);
    LocalDateTime getDate(Order order);
}
