package com.revature.web;

import javax.servlet.http.HttpServletRequest;

public interface Dispatcher {

	boolean supports(HttpServletRequest request);
	Object execute(HttpServletRequest request);
}