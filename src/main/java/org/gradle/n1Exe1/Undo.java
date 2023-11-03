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
	
	public static List<Request> storeRequest (Request request) {
		requestList.add(request);
		return requestList;
	}
	
	public static List<Request> removeRequest () {
		requestList.remove(requestList.size()-1);
		return requestList;
	}
	
	public static void getRequests () {
		for (Request req : requestList) {
			System.out.println(req);
		}
	}
	
}