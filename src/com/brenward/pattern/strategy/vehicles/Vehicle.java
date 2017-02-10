package com.brenward.pattern.strategy.vehicles;

import com.brenward.pattern.strategy.behaviours.MovementBehaviour;

public abstract class Vehicle {
	
	// Composition instead of inheritance to allow reuse without duplication
	protected MovementBehaviour movementBehaviour;
	
	// Vehicle behaviour common to all but with unique implementation
	public abstract void park();
	
	// Vehicles can move in different ways but some are similar
	public void moveVehicle(){
		movementBehaviour.move();
	}
	
	// Allow change to behaviour (more flexible than inheritence and overriding
	public void setMovementBehaviour(MovementBehaviour movementBehaviour){
		this.movementBehaviour = movementBehaviour;
	}
}
