package org.gradle.n2Exe1.entity;

public class Contact {
	
	private int contactId;
	private String contactName;
	private String contactSurname;
	private String contactPhoneNumber;
	private String contactAddress;
	
	public Contact (int contactId, String contactName, String contactSurname, String contactPhoneNumber, String contactAddress) {
		
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactSurname = contactSurname;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactAddress = contactAddress;
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

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public int getContactId() {
		return contactId;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactSurname=" + contactSurname
				+ ", contactPhoneNumber=" + contactPhoneNumber + ", contactAddress=" + contactAddress + "]";
	}
	
}