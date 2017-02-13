package com.brenward.pattern.strategy.behaviours;

public class JetEngine implements EngineBehaviour{

	@Override
	public void turnOn() {
		System.out.println("I'm ready to fly");		
	}

}
