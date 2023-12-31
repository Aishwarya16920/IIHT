package com.in28minutes.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoServiceStub;
import com.in28miutes.data.api.TodoService;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrievetTodoRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
