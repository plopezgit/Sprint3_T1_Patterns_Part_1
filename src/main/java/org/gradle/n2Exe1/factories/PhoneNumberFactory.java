package org.gradle.n2Exe1.factories;

import org.gradle.n2Exe1.entity.SpainPhoneNumber;

public class PhoneNumberFactory implements IternationalFormatContactAbstractFactory {

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
