package com.sscl.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	public List<String> retrieveToDos(String user) {
		if (user.equals("Sanjay")) {
			return Arrays.asList("Learn API using Katalon Studio", "Learn API using SoapUI Open Source version",
					"Learn API using Postman", "Learn anything else");
		} else {
			return null;
		}

	}

}
