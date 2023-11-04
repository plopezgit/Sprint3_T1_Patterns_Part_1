package org.gradle.n1Exe1;

public class App {
	
	public static void main(String[] args) {
		
		Undo undo = Undo.getInstance();
		Request request;
		
		do {
			request = new Request(Input
				.inputString("Request key (type '#z' to undo or '#e' to exit):"));
			
			if (!request.toString().equalsIgnoreCase("#z")) {
				undo.doRequest(request);
				undo.getRequestsHistory();
			} else {
				try {
					undo.unDoRequest();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Undo is empty");
				}
				undo.getRequestsHistory();
			}
			
		} while (!request.toString().equalsIgnoreCase("#e"));		
	}
	
}