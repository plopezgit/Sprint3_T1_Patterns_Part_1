package org.gradle.n2Exe1.factories;

public interface IternationalFormatContactAbstractFactory {
	
	PhoneNumberInterface createPhoneNumber (String country);
	AddressInterface createAddress (String country);
}