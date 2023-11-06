package org.gradle.n1Exe2;

import org.gradle.n1Exe2.implementations.SpainAddress;
import org.gradle.n1Exe2.implementations.SpainPhoneNumber;

public class Contact {
	
	private int contactId;
	private String contactName;
	private String contactSurname;
	private SpainAddress contactAddress;
	private SpainPhoneNumber contactPhoneNumber;
	
	public Contact (int contactId, String contactName, String contactSurname, SpainAddress contactAddress, SpainPhoneNumber contactPhoneNumber) {
		
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactSurname = contactSurname;
		this.contactAddress = contactAddress;
		this.contactPhoneNumber = contactPhoneNumber;

	}
	
	
	
}