package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.util.Json;

public class DispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final Logger logger = LogManager.getLogger(getClass());
	private final Dispatcher dispatcherChain = DispatcherChain.getInstance();

	public DispatcherServlet() {
	}
	
}













