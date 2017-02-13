package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.EngineBehaviour;

public class Bike extends Vehicle{
	
	public Bike(EngineBehaviour engineBehavior){
		this.engineBehaviour = engineBehavior;
	}

	@Override
	public void park() {
		System.out.println("I'm parking in the shed");		
	}

}
