package org.gradle.n1Exe2;


public class Contact {
	
	private String contactName;
	private String contactSurname;
	private InternationalAddress contactAdress;
	private InternationalPhoneNumber contactPhoneNumber;
	
	public Contact (String contactName, String contactSurname, InternationalAddress contactAdress, InternationalPhoneNumber contactPhoneNumber) {
		
		this.contactName = contactName;
		this.contactSurname = contactSurname;

	}
	
}