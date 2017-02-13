package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.EngineBehaviour;

public class Plane extends Vehicle{
	
	public Plane(EngineBehaviour engineBehavior){
		this.engineBehaviour = engineBehavior;
	}
	@Override
	public void park() {
		System.out.println("I'm parking in a hangar");		
	}
	
}
