package com.vlad.patterns.strategy;
/**
*here we create an instance of the interface,
 * with the help of which, when calling the constructor,
 * we will select the transport with which we will move along the route
*/
public class Navigator {
	private final RouteStrategy routeStrategy;

	public Navigator(RouteStrategy routeStrategy) {
		this.routeStrategy = routeStrategy;
	}

	public int executeRouteStrategy(int a, int b) {
		return routeStrategy.buildRoute(a, b);
	}
}
