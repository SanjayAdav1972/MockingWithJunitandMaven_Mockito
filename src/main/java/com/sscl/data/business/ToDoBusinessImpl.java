package com.sscl.data.business;

import java.util.ArrayList;
import java.util.List;

import com.sscl.data.api.ToDoService;

public class ToDoBusinessImpl {
	private ToDoService todoService;

	public ToDoBusinessImpl(ToDoService todoService) {
		super();
		this.todoService = todoService;

	}

	public List<String> retrieveTodosRelatedToAPI(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveToDos(user);
		for (String todo : allTodos) {
			if (todo.contains("API")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
