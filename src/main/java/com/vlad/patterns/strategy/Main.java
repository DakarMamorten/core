package com.vlad.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Navigator navigator = new Navigator(new WalkingStrategy());
        navigator.executeRouteStrategy(a, b);
    }
}
