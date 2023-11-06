package org.gradle.n1Exe2.implementations;

import org.gradle.n1Exe2.interfaces.AbstractFactory;
import org.gradle.n1Exe2.interfaces.AddressInterface;
import org.gradle.n1Exe2.interfaces.PhoneNumberInterface;

public class PhoneNumberFactory implements AbstractFactory {

	@Override
	public PhoneNumberInterface getPhoneNumber(String country) {
		if (country.equalsIgnoreCase("spain")) {
			return new SpainPhoneNumber();
		}
		return null;
		
	}

	@Override
	public AddressInterface getAdress(String country) {
		return null;
	}

}
