package org.gradle.n3Exe1.command;

import org.gradle.n3Exe1.entity.Vehicle;

public class VehicleStartingEngine implements Parking {
	
	private Vehicle vehicle; 
	
	public VehicleStartingEngine(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.startVehicle();

	}

}
