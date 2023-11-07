package org.gradle.n2Exe1;

import org.gradle.n2Exe1.implementations.AddressFactory;
import org.gradle.n2Exe1.implementations.PhoneNumberFactory;
import org.gradle.n2Exe1.interfaces.AbstractFactory;

public class GetterFactory {
	
	public static AbstractFactory getFactory (String type) {
		
		if (type.equalsIgnoreCase("address")) {
			
			return new AddressFactory();
			
		} else if (type.equalsIgnoreCase("phone number")) {
			
			return new PhoneNumberFactory();
		}

		return null;
	}
}