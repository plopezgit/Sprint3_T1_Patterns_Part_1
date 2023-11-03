package org.gradle.n1Exe1;

public class App {
	
	public static void main(String[] args) {
		
		Undo undo = Undo.getInstance();
		
		Undo.storeRequest(new Request(Input.inputString("Request key: ")));
		Undo.getRequests();
		Undo.storeRequest(new Request(Input.inputString("Request key: ")));
		Undo.getRequests();
		Undo.storeRequest(new Request(Input.inputString("Request key: ")));
		Undo.getRequests();
		Undo.storeRequest(new Request(Input.inputString("Request key: ")));
		Undo.getRequests();
		Undo.storeRequest(new Request(Input.inputString("Request key: ")));
		Undo.getRequests();
		Undo.removeRequest();
		System.out.println("Latest key get removed from history list");
		Undo.getRequests();
				
	}
	
}