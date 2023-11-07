package org.gradle.n2Exe1.interfaces;

public interface AbstractFactory {
	
	PhoneNumberInterface createPhoneNumber (String country);
	AddressInterface createAddress (String country);
}