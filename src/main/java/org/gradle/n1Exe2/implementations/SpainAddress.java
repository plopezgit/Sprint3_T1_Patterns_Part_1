package org.gradle.n1Exe2.implementations;

import org.gradle.n1Exe2.interfaces.AddressInterface;

public class SpainAddress implements AddressInterface {
	
	private String country;
	
	public SpainAddress() {
		this.country = "ES";
	}

	@Override
	public String getAddress(String street, String number, String postalCode) {
		return street + ", " + number + " " + postalCode + ", " + country;
		
	}
	
	
}