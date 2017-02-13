package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.EngineBehaviour;

public abstract class Vehicle {
	
	// Composition instead of inheritance to allow reuse without duplication
	protected EngineBehaviour engineBehaviour;
	
	// Vehicle behaviour common to all but with unique implementation
	public abstract void park();
	
	// Vehicles can have engines but may not
	public void turnOnEngine(){
		engineBehaviour.turnOn();
	}
	
	// Allow change to behaviour (more flexible than inheritence and overriding
	public void setEngineBehaviour(EngineBehaviour engineBehaviour){
		this.engineBehaviour = engineBehaviour;
	}
}
