package org.gradle.n2Exe1.client;

import org.gradle.n2Exe1.entity.Contact;
import org.gradle.n2Exe1.entity.ContactBook;
import org.gradle.n2Exe1.exceptions.NoContactException;
import org.gradle.n2Exe1.factories.IternationalFormatContactAbstractFactory;
import org.gradle.n2Exe1.factories.AddressInterface;
import org.gradle.n2Exe1.factories.GetterFactory;
import org.gradle.n2Exe1.factories.PhoneNumberInterface;
import org.gradle.n2Exe1.utils.Input;

public class App {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ContactBook contactBook = ContactBook.getInstance();

		IternationalFormatContactAbstractFactory phoneNumberFactory = GetterFactory.getFactory("phone number");
		PhoneNumberInterface phoneNumber = phoneNumberFactory.createPhoneNumber("Spain");
		IternationalFormatContactAbstractFactory addressFactory = GetterFactory.getFactory("address");
		AddressInterface address = addressFactory.createAddress("Spain");

		contactBook.addContact(new Contact(1, Input.inputString("Name: "), Input.inputString("Surname: "),
				phoneNumber.formatPhoneNumber(Input.inputString("Phone number: ")),
				address.formatAddress(Input.inputString("Street: "), Input.inputString("Number: "),
						Input.inputString("Postal code: "))));
		contactBook.addContact(new Contact(2, Input.inputString("Name: "), Input.inputString("Surname: "),
				phoneNumber.formatPhoneNumber(Input.inputString("Phone number: ")),
				address.formatAddress(Input.inputString("Street: "), Input.inputString("Number: "),
						Input.inputString("Postal code: "))));

		contactBook.printContactList();

		try {
			contactBook.removeContact(2);
		} catch (NoContactException e) {
			System.err.println("Contact does not exist");
			e.printStackTrace();
		}

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