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
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// We need to configure the different options such that our application
		// can RESPOND to any client, as long as it's a valid request to our resource
		logger.info("{} request coming to {}", req.getMethod(), req.getRequestURI());
		if (dispatcherChain.supports(req)) {
			Object toBeTurnedIntoJson = dispatcherChain.execute(req);
			if (toBeTurnedIntoJson != null) {
				resp.setContentType(Json.CONTENT_TYPE);
				resp.getOutputStream().write(Json.write(toBeTurnedIntoJson));
			} else {
				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);	
			}
		} else {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
	}
}












