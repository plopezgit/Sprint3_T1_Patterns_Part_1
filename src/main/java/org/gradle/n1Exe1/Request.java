package org.gradle.n1Exe1;

public class Request {
	
	private String key;
	
	public Request (String key) {
		this.key = key;
		
	}
	
	@Override
	public String toString() {
			return "Request Key: " + key + "|";
		}
}