package com.revature.dao;

import java.util.List;

import com.revature.model.Todo;

public interface TodoDao {

	List<Todo> getAllTodos();
	Todo findTodoById(int id);
	Todo createTodo(Todo todo);
	Todo updateTodo(Todo todo);
}
