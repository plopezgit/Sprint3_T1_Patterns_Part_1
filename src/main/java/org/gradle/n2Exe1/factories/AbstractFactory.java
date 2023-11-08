package org.gradle.n2Exe1.factories;

public interface AbstractFactory {
	
	PhoneNumberInterface createPhoneNumber (String country);
	AddressInterface createAddress (String country);
}