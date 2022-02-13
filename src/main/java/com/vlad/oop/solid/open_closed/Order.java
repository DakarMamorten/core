package com.vlad.oop.solid.open_closed;

import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 */
@ToString
public class Order {
    private final List<LineItem> lineItems;
    private Shipping shipping;

    public Order() {
        this.lineItems = new ArrayList<>();
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public int getTotal() {
        return lineItems.stream()
                .map(LineItem::getQuantity)
                .reduce(0, Integer::sum);
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void add(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public double getTotalWeight() {
        return lineItems.stream()
                .map(LineItem::getWeight)
                .reduce(0.0, Double::sum);
    }

    public double getShippingCost() {
        return shipping.getCost(this);
    }

    public LocalDateTime getShippingDate() {
        return shipping.getDate(this);
    }
}
