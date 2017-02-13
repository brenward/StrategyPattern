package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.EngineBehaviour;

public class Boat extends Vehicle{
	
	public Boat(EngineBehaviour engineBehavior){
		this.engineBehaviour = engineBehavior;
	}
	
	@Override
	public void park() {
		System.out.println("I'm parking in a boathouse");		
	}

}
