package com.brenward.pattern.strategy.behaviours;

public class Sail implements MovementBehaviour{

	@Override
	public void move() {
		System.out.println("I'm sailing along a water surface");
	}

}
