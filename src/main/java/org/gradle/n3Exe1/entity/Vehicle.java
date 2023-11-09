package org.gradle.n3Exe1.entity;

public class Vehicle {
	
	private int vehicleId;
	private int state;
	private int accelerator;
	
	public Vehicle(int vehicleId) {
		this.vehicleId = vehicleId;
		state = 0;
		accelerator =0;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getAccelerator() {
		return accelerator;
	}
	
	public void setAccelerator(int accelerator) {
		this.accelerator = accelerator;
	}
	
	public int startVehicle() {
		System.out.println(vehicleId + " starts engine.");
		return state + 1;
	}

	public int accelerateVehicle(int velocity) {
		System.out.println(vehicleId + " accelerates at (limit): " + velocity + " until get place.");
		return state + velocity;
	}

	public void brakeVehicle() {
		System.out.println(vehicleId + " brakes on its place.");
		state = 1;
	}

	public void stopVehicle() {
		System.out.println(vehicleId + " stops engine.");
		state = 0;
	}
			
}
