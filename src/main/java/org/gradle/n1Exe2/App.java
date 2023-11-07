package org.gradle.n1Exe2;

import org.gradle.n1Exe2.interfaces.AbstractFactory;
import org.gradle.n1Exe2.interfaces.AddressInterface;
import org.gradle.n1Exe2.interfaces.PhoneNumberInterface;

public class App {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ContactBook contactBook = ContactBook.getInstance();
		
		AbstractFactory phoneNumberFactory = GetterFactory.getFactory("phone number");
		PhoneNumberInterface phoneNumber = phoneNumberFactory.createPhoneNumber("Spain");
		AbstractFactory addressFactory = GetterFactory.getFactory("address");
		AddressInterface address = addressFactory.createAddress("Spain");
		
		contactBook.getContactList()
				.add(new Contact(1, Input.inputString("Name: "), Input.inputString("Surname: "),
						phoneNumber.getPhoneNumber(Input.inputString("Phone number: ")),
						address.getAddress(Input.inputString("Street: "), Input.inputString("Number: "),
								Input.inputString("Postal code: "))));
		
		contactBook.printContactList();
		
		/*
		 * - Level 2 Abstract Factory** Create a small manager of international phone
		 * numbers and addresses. The application must allow international addresses and
		 * phone numbers to be added to the address book. Considering the different
		 * formats of different countries, it builds the phone book, addresses and
		 * phones by implementing an Abstract Factory pattern.
		 */

	}
}