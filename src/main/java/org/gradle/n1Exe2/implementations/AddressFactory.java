package org.gradle.n1Exe2.implementations;

import org.gradle.n1Exe2.interfaces.AbstractFactory;
import org.gradle.n1Exe2.interfaces.AddressInterface;
import org.gradle.n1Exe2.interfaces.PhoneNumberInterface;

public class AddressFactory implements AbstractFactory {

	@Override
	public AddressInterface getAdress(String country) {
		if (country.equalsIgnoreCase("spain")) {
			return new SpainAddress();
		}
		return null;
	}

	@Override
	public PhoneNumberInterface getPhoneNumber(String country) {
		return null;
	}
}
