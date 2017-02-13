package com.brenward.pattern.strategy;

import com.brenward.pattern.strategy.behaviours.DieselEngine;
import com.brenward.pattern.strategy.behaviours.NoEngine;
import com.brenward.pattern.strategy.vehicles.Bike;
import com.brenward.pattern.strategy.vehicles.Car;
import com.brenward.pattern.strategy.vehicles.Vehicle;

public class Test {
	public static void main(String[] args){
		Vehicle myCar = new Car(new DieselEngine());
		Vehicle myBike = new Bike(new DieselEngine());
		
		myCar.turnOnEngine();
		myBike.turnOnEngine();
		
		// Remove my car's engine
		myCar.setEngineBehaviour(new NoEngine());
		myCar.turnOnEngine();
	}
}
