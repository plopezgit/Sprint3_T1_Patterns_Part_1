package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.factories.PhoneNumberInterface;

public class SpainPhoneNumber implements PhoneNumberInterface {
	
	private String prefix;
	
	public SpainPhoneNumber() {
		this.prefix = "+34 ";
	}

	@Override
	public String formatPhoneNumber(String number) {
		return prefix + number;
	}

}