package org.gradle.n2Exe1;

import java.util.*;

import org.gradle.n2Exe1.exceptions.NoContactException;

public class ContactBook {
	
	private static ContactBook contactBook;
	private static List<Contact> contactList;
	
	
	private ContactBook () {
		contactList = new ArrayList<>();
	}
	
	public static ContactBook getInstance() {
		if (contactBook == null) {
			contactBook = new ContactBook();
		}
		return contactBook;
	}
	
	public static List<Contact> addContact (Contact contact) {
		contactList.add(contact);
		
		return contactList;
	}
	
	public static List<Contact> removeContact (int contactId) throws NoContactException {
		if (existContact (contactId) == -1) {
			throw new NoContactException ("The seat does not exist.\n");
		} else {
			contactList.remove(existContact (contactId));
		}
		
		return contactList;
	}
	
	public static List<Contact> getContactList() {
		return contactList;
	}

	public static void printContactList () {
		contactList.stream().forEach(System.out::println);
	}
	
	public static int existContact (int contactID) {
		Contact contact = new Contact(contactID);
		int contactIndex = contactList.indexOf(contact);
		
		return contactIndex;
	}
	
}