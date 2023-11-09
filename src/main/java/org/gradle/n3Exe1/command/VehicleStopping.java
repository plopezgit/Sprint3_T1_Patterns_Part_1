package org.gradle.n3Exe1.command;

import org.gradle.n3Exe1.entity.Vehicle;

public class VehicleStopping implements Parking {

	private Vehicle vehicle; 
	
	public VehicleStopping(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	@Override
	public void execute() {
		vehicle.stopVehicle();

	}

}
