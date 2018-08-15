package com.sscl.data.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.sscl.data.api.ToDoService;

public class TodoBusinessImplMockTest {

	@Test
	public void test() {
		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn API using Katalon Studio", "Learn API using SoapUI Open Source version",
				"Learn API using Postman", "Learn anything else");
		
		when(todoServiceMock.retrieveToDos("dummy")).thenReturn(todos);
		
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
		List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToAPI("dummy");
		assertEquals(3, filteredTodos.size());
	}

	@Test
	public void testEmptyList() {
		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList();
		
		when(todoServiceMock.retrieveToDos("dummy")).thenReturn(todos);
		
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
		List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToAPI("dummy");
		assertEquals(0, filteredTodos.size());
	}
}
