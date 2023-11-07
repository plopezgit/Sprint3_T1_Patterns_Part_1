package org.gradle.n2Exe1.implementations;

import org.gradle.n2Exe1.interfaces.AddressInterface;

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