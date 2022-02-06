package com.vlad.patterns.strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public int buildRoute(int a, int b) {
        return a * b;
    }
}
