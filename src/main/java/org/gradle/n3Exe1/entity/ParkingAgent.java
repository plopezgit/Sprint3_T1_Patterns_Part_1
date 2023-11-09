package org.gradle.n3Exe1.entity;

import java.util.ArrayList;
import java.util.List;

import org.gradle.n3Exe1.command.Parking;

public class ParkingAgent {
	private List<Parking> parkingQueue = new ArrayList<>();
	
	public void takeParking(Parking parking) {
		parkingQueue.add(parking);
	}
	
	public void executeParking() {
		for (Parking parking : parkingQueue) {
			parking.execute();
		}
		parkingQueue.clear();
	}
	
}
