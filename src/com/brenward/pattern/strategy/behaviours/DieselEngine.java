package com.brenward.pattern.strategy.behaviours;

public class DieselEngine implements EngineBehaviour{

	@Override
	public void turnOn() {
		System.out.println("I'm sucking diesel");		
	}

}
