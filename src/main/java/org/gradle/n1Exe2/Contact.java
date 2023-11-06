package org.gradle.n1Exe2;

import org.gradle.n1Exe2.implementations.SpainAddress;
import org.gradle.n1Exe2.implementations.SpainPhoneNumber;

public class Contact {
	
	private int contactId;
	private String contactName;
	private String contactSurname;
	
	
	public Contact (int contactId, String contactName, String contactSurname, SpainAddress contactAddress, SpainPhoneNumber contactPhoneNumber) {
		
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactSurname = contactSurname;
		
	}
	
	public Contact (int contactId) {
		
		this.contactId = contactId;
		
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactSurname() {
		return contactSurname;
	}

	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}

	public int getContactId() {
		return contactId;
	}
	
	
	
	
	
	
	
}