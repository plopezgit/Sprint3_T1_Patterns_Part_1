package org.gradle.n1Exe2.implementations;

import org.gradle.n1Exe2.interfaces.AbstractFactory;
import org.gradle.n1Exe2.interfaces.AddressInterface;
import org.gradle.n1Exe2.interfaces.PhoneNumberInterface;

public class PhoneNumberFactory implements AbstractFactory {

	@Override
	public PhoneNumberInterface createPhoneNumber(String country) {
		if (country.equalsIgnoreCase("spain")) {
			return new SpainPhoneNumber();
		}
		return null;
		
	}

	@Override
	public AddressInterface createAddress(String country) {
		return null;
	}

}
