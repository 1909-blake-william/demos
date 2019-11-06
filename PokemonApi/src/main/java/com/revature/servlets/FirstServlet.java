package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		System.out.println("Poto init param: " + config.getInitParameter("Poto"));
		System.out.println("To context param: " + config.getServletContext().getInitParameter("To"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("request received with uri: " + req.getRequestURI());
//		resp.getWriter().write("Hello from our first servlet");
		
		// redirect
//		resp.sendRedirect("https://bing.com");
		
		// forward
//		req.getRequestDispatcher("/pokemon").forward(req, resp);
		
	}
}
