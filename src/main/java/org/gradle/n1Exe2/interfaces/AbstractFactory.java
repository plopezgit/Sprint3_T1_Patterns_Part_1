package org.gradle.n1Exe2.interfaces;

public interface AbstractFactory {
	
	PhoneNumberInterface createPhoneNumber (String country);
	AddressInterface createAddress (String country);
}