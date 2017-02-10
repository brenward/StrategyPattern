package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.MovementBehaviour;

public class Car extends Vehicle{
	
	public Car(MovementBehaviour movementBehavior){
		this.movementBehaviour = movementBehavior;
	}

	@Override
	public void park() {
		System.out.println("I'm parking in the garage");		
	}

}
