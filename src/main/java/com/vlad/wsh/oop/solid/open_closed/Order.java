package com.vlad.wsh.oop.solid.open_closed;

/**
 * classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 */
public class Order {
    private String linItems;
    private Shipping shipping;
    private int total;
    private int totalWeight;
    private Shipping shippingType;
    private Shipping shippingCost;

    public String getLinItems() {
        return linItems;
    }

    public void setLinItems(String linItems) {
        this.linItems = linItems;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Shipping getShippingType() {
        return shippingType;
    }

    public void setShippingType(Shipping shippingType) {
        this.shippingType = shippingType;
    }

    public Shipping getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Shipping shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Shipping getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Shipping shippingDate) {
        this.shippingDate = shippingDate;
    }

    private Shipping shippingDate;
}
