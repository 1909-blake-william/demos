package com.revature.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Dispatcher {

	boolean supports(HttpServletRequest request);
	void execute(HttpServletRequest request, HttpServletResponse response);
}
