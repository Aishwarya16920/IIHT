package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

import com.in28miutes.data.api.TodoService;

public class TodoServiceStub implements TodoService{
	public List<String> retrieveTodos(String user){
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}
}
