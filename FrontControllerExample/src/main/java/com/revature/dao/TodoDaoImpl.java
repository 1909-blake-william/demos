package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.Todo;

public class TodoDaoImpl implements TodoDao {

	// Used to mock database interaction
	private final List<Todo> todos = new ArrayList<>();
	
	public TodoDaoImpl() {
		for (int i = 0; i < 100; i++) {
			todos.add(new Todo(i, "Todo " + i, i % 2 == 0));
		}
	}
	
	@Override
	public List<Todo> getAllTodos() {
		return todos;
	}

	@Override
	public Todo createTodo(Todo todo) {
		if (todos.add(todo)) {
			return todo;
		}
		return null;
	}

	@Override
	public Todo findTodoById(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	@Override
	public Todo updateTodo(Todo todo) {
		for (int i = 0; i < todos.size(); i++) {
			if (todos.get(i).getId() == todo.getId()) {
				todos.set(i, todo);
				return todo;
			}
		}
		return null;
	}

	
}
