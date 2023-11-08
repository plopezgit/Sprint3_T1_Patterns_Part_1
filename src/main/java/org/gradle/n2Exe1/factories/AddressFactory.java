package org.gradle.n2Exe1.factories;

import org.gradle.n2Exe1.entity.SpainAddress;

public class AddressFactory implements IternationalContactAbstractFactory {

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
