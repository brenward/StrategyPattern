package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.MovementBehaviour;

public class Boat extends Vehicle{
	
	public Boat(MovementBehaviour movementBehavior){
		this.movementBehaviour = movementBehavior;
	}
	
	@Override
	public void park() {
		System.out.println("I'm parking in a boathouse");		
	}

}
