package org.gradle.n3Exe1.command;

import org.gradle.n3Exe1.entity.Vehicle;

public class VehicleAcceleration implements Parking {

	private Vehicle vehicle;
	private int parkingVelocitylimit;
	
	public VehicleAcceleration(Vehicle vehicle) {
		this.vehicle = vehicle;
		setParkingVelocitylimit(2);
	}

	@Override
	public void execute() {
		vehicle.accelerateVehicle(2);

	}

	public int getParkingVelocitylimit() {
		return parkingVelocitylimit;
	}

	public void setParkingVelocitylimit(int parkingVelocitylimit) {
		this.parkingVelocitylimit = parkingVelocitylimit;
	}

}
