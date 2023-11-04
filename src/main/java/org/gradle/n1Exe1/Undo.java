package org.gradle.n1Exe1;

import org.gradle.n1Exe1.*;
import java.util.*;

public class Undo {
	
	private static Undo undo;
	private Request request;
	private static List<Request> requestList = new ArrayList<>();
	
	private Undo () {	
	}
	
	public static Undo getInstance() {
		if (undo == null) {
			undo = new Undo();
		}
		return undo;
	}
	
	public static List<Request> doRequest (Request request) {
		if (!request.toString().equalsIgnoreCase("#z")) {
			requestList.add(request);
		}
		return requestList;
	}
	
	public static List<Request> unDoRequest () {
		requestList.remove(requestList.size()-1);
		return requestList;
	}
	
	public static void getRequestsHistory () {
		requestList.stream().forEach(System.out::println);
	}
	
}