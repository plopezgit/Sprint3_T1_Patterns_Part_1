package org.gradle.n2Exe1.utils;

import java.util.Scanner;

public class Input {
	
	private static final Scanner input = new Scanner(System.in);
	private static final String EMPTY_STRING_ERR_MSG = "Your respose must not be empty.";
	
	public static String inputString (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine();
				if (response.isEmpty()) { 
					throw new Exception(EMPTY_STRING_ERR_MSG); 
				} else {
					
				okey = true;
				}
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
		} while (!okey);
		return response;	
	}
	
}