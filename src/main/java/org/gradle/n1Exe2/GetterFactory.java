package org.gradle.n1Exe2;

import org.gradle.n1Exe2.implementations.AddressFactory;
import org.gradle.n1Exe2.implementations.PhoneNumberFactory;
import org.gradle.n1Exe2.interfaces.AbstractFactory;

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