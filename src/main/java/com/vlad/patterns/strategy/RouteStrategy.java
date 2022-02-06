package com.vlad.patterns.strategy;

/**
 * interface from which will implements transport options
 */
public interface RouteStrategy {
    int buildRoute(int a, int b);
}
