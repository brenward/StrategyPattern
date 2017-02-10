package com.brenward.pattern.strategy.behaviours;

public class Drive implements MovementBehaviour{

	@Override
	public void move() {
		System.out.println("I'm driving along a road");		
	}

}
