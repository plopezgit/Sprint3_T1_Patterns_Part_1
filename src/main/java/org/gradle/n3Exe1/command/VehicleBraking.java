package org.gradle.n3Exe1.command;

import org.gradle.n3Exe1.entity.Vehicle;

public class VehicleBraking implements Parking {
	
	private Vehicle vehicle;
	
	public VehicleBraking(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.brakeVehicle();

	}

}
