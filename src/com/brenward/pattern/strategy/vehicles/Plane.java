package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.MovementBehaviour;

public class Plane extends Vehicle{
	
	public Plane(MovementBehaviour movementBehavior){
		this.movementBehaviour = movementBehavior;
	}
	@Override
	public void park() {
		System.out.println("I'm parking in a hangar");		
	}
	
}
