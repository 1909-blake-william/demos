package com.revature.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.model.LoginForm;
import com.revature.util.Json;

public class AuthDispatcher implements Dispatcher {
	
	private final UserDao userDao = UserDaoImpl.getInstance();
	private final Logger logger = LogManager.getLogger(getClass());
	
	private static final Dispatcher instance = new AuthDispatcher();
	
	@Override
	public boolean supports(HttpServletRequest request) {
		return request.getRequestURI().equals("/ERSDemo/api/login") && 
				request.getMethod().equals("POST"); 
	}

	@Override
	public Object execute(HttpServletRequest request) {
		try {
			LoginForm form = (LoginForm) Json.read(request.getInputStream(), LoginForm.class);
			return userDao.login(form.getUsername(), form.getPassword());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Dispatcher getInstance() {
		return instance;
	}

}
