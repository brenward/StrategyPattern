package com.brenward.pattern.strategy.behaviours;

public class Fly implements MovementBehaviour{

	@Override
	public void move() {
		System.out.println("I'm flying through the air");		
	}

}
