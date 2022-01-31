package com.vlad.patterns.strategy;

public class TaxiStrategy implements RouteStrategy {
	@Override
	public int buildRoute(int a, int b) {
		return a - b;
	}
}
