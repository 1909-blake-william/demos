package com.revature.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;
import com.revature.model.Todo;

public class Dispatcher {

	private static TodoDao todoDao = new TodoDaoImpl();
	
	// You should only use one instance of an ObjectMapper and reuse in your applications
	private static ObjectMapper mapper = new ObjectMapper();
	
	private static final String REIMBURSEMENTS_URI = "/FrontControllerExample/api/reimbursements";

	// Restrict instantiation
	private Dispatcher() {
	}

	// The purpose of this class, this method, is to determine WHAT ACTION your
	// application
	// is supposed to take, given the provided HTTP Method and URI
	public static Object dispatch(HttpServletRequest request, HttpServletResponse response) {
		// In REST, the action we take upon a resource is determined by a combination of the Method used
		// And the URI we send the request to
		
		// First, we separate our logic in this dispatcher based on which HTTP Method is used
		if (isGet(request)) {
			// Then, we determine which action to take based on the URI
			
			// NO, this is not the only way and NO, this is not the best way to handle this
			// I personally think using the Command design pattern here would work better
			if (request.getRequestURI().startsWith(REIMBURSEMENTS_URI)) {
				// How do you handle the URI /FrontControllerExample/api/reimbursements/2
				String[] path = request.getRequestURI().split("/");
				System.out.println(Arrays.toString(path));
				if (path.length == 4) {
					return todoDao.getAllTodos();
				} else if (path.length == 5) {
					int id = Integer.valueOf(path[4]);
					return todoDao.findTodoById(id);
				}
			}
		} else if (isPost(request)) {
			if (request.getRequestURI().equals(REIMBURSEMENTS_URI)) {
				try {
					Todo todo = mapper.readValue(request.getInputStream(), Todo.class);
					return todoDao.createTodo(todo);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		} else if (isPut(request)) {
			if (request.getRequestURI().equals(REIMBURSEMENTS_URI)) {
				try {
					Todo todo = mapper.readValue(request.getInputStream(), Todo.class);
					return todoDao.updateTodo(todo);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * Helper Methods
	 */
	private static boolean isGet(HttpServletRequest request) {
		return request.getMethod().equals("GET");
	}

	private static boolean isPost(HttpServletRequest request) {
		return request.getMethod().equals("POST");
	}
	
	private static boolean isPut(HttpServletRequest request) {
		return request.getMethod().equals("PUT");
	}
}
