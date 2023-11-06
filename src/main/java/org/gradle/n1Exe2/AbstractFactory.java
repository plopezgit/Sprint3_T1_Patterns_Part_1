package org.gradle.n1Exe2;

public interface AbstractFactory {
	
	PhoneNumberInterface getPhoneNumber (String country);
	AddressInterface getAdress (String country);
}