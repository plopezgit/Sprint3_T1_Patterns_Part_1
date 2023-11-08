package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.factories.AddressInterface;

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