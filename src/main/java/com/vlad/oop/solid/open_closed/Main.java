package com.vlad.oop.solid.open_closed;

public class Main {
    public static void main(String[] args) {
        LineItem book = new LineItem(1,"Harry Potter",200,1);
        Order order = new Order();
        order.add(book);
//        order.setShipping(new Ground());
        order.setShipping(new Air());
        System.out.println(order);
    }
}
