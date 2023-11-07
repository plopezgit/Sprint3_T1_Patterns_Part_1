package org.gradle.n2Exe1.implementations;

import org.gradle.n2Exe1.interfaces.AbstractFactory;
import org.gradle.n2Exe1.interfaces.AddressInterface;
import org.gradle.n2Exe1.interfaces.PhoneNumberInterface;

public class AddressFactory implements AbstractFactory {

	@Override
	public AddressInterface createAddress(String country) {
		if (country.equalsIgnoreCase("spain")) {
			return new SpainAddress();
		}
		return null;
	}

	@Override
	public PhoneNumberInterface createPhoneNumber(String country) {
		return null;
	}
}
