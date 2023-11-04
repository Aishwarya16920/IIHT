package com.in28minutes.business;

import java.util.ArrayList;
import java.util.List;

import com.in28miutes.data.api.TodoService;

public class TodoBusinessImpl {
	
	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrievetTodoRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
