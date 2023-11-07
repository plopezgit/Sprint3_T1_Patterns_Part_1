package org.gradle.n1Exe2.implementations;

import org.gradle.n1Exe2.interfaces.PhoneNumberInterface;

public class SpainPhoneNumber implements PhoneNumberInterface {
	
	private String prefix;
	
	public SpainPhoneNumber() {
		this.prefix = "+34 ";
	}

	@Override
	public String getPhoneNumber(String number) {
		return prefix + number;
	}

}