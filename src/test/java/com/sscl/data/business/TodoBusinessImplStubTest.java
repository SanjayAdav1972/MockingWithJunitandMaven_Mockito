package com.sscl.data.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sscl.data.api.ToDoService;
import com.sscl.data.api.ToDoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		ToDoService todoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceStub);
		List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToAPI("Sanjay");
		assertEquals(3, filteredTodos.size());
	}

}
