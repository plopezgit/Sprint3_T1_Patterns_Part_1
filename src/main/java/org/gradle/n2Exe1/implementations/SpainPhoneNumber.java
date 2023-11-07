package org.gradle.n2Exe1.implementations;

import org.gradle.n2Exe1.interfaces.PhoneNumberInterface;

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