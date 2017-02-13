package com.brenward.pattern.strategy.behaviours;

public class NoEngine implements EngineBehaviour{

	@Override
	public void turnOn() {
		System.out.println("I can't turn on");
	}

}
