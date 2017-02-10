package com.brenward.pattern.strategy;

import com.brenward.pattern.strategy.behaviours.Drive;
import com.brenward.pattern.strategy.behaviours.Sail;
import com.brenward.pattern.strategy.vehicles.Bike;
import com.brenward.pattern.strategy.vehicles.Car;
import com.brenward.pattern.strategy.vehicles.Vehicle;

public class Test {
	public static void main(String[] args){
		Vehicle myCar = new Car(new Drive());
		Vehicle myBike = new Bike(new Drive());
		
		myCar.moveVehicle();
		myBike.moveVehicle();
		
		// Turn my car into an amphibious car
		myCar.setMovementBehaviour(new Sail());
		myCar.moveVehicle();
	}
}
