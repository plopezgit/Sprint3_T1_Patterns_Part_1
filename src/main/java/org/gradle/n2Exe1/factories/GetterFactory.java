package org.gradle.n2Exe1.factories;

public class GetterFactory {
	
	public static IternationalContactAbstractFactory getFactory (String type) {
		
		if (type.equalsIgnoreCase("address")) {
			
			return new AddressFactory();
			
		} else if (type.equalsIgnoreCase("phone number")) {
			
			return new PhoneNumberFactory();
		}

		return null;
	}
}