package com.vlad.oop.solid.liskov_sub.first_example;

/**
 * if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.
 */
public class ElectricCar implements Car {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {

    }
}
