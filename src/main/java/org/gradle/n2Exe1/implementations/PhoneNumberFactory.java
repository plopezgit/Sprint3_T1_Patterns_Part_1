package org.gradle.n2Exe1.implementations;

import org.gradle.n2Exe1.interfaces.AbstractFactory;
import org.gradle.n2Exe1.interfaces.AddressInterface;
import org.gradle.n2Exe1.interfaces.PhoneNumberInterface;

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
