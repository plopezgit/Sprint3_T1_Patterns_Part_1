package org.gradle.n3Exe1.client;

import org.gradle.n3Exe1.command.VehicleAcceleration;
import org.gradle.n3Exe1.command.VehicleBraking;
import org.gradle.n3Exe1.command.VehicleStartingEngine;
import org.gradle.n3Exe1.command.VehicleStopping;
import org.gradle.n3Exe1.entity.Car;
import org.gradle.n3Exe1.entity.ParkingAgent;

public class App {
	
	public static void main (String[] args) {
		
		Car car1 = new Car(91676);
		
		VehicleStartingEngine startCarParking = new VehicleStartingEngine(car1);
		VehicleAcceleration accelerateCarParking = new VehicleAcceleration(car1);
		VehicleBraking brakeCarParking = new VehicleBraking(car1);
		VehicleStopping stopCarParking = new VehicleStopping (car1);
		
		ParkingAgent parkingAgent = new ParkingAgent();
		
		parkingAgent.takeParking(startCarParking);
		parkingAgent.takeParking(accelerateCarParking);
		parkingAgent.takeParking(brakeCarParking);
		parkingAgent.takeParking(stopCarParking);
		
		parkingAgent.executeParking();
		
		/*
		Diseña un aparcamiento de 4 vehículos: un coche, una bicicleta, un avión y un barco.
		Muestra cómo funciona el patrón Comando que implementa el inicio, aceleración,
		y métodos de frenado para cada tipo de vehículo.
		*/
			
	}
}