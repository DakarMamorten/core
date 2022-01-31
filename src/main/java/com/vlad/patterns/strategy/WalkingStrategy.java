package com.vlad.patterns.strategy;

public class WalkingStrategy implements RouteStrategy {
	@Override
	public int buildRoute(int a, int b) {
		System.out.println("Walking...");
		return a / b;
	}
}
