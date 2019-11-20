package com.revature.web;

import javax.servlet.http.HttpServletRequest;

public class ReimbursementDispatcher implements Dispatcher {

	@Override
	public boolean supports(HttpServletRequest request) {
		return isGetAllReimbursements(request) || 
				isCreateReimbursement(request) ||
				isResolveReimbursement(request) ||
				isGetOneReimbursement(request) ||
				isGetReimbursementsByStatus(request) ||
				isGetReimbursementsByUsername(request);
	}

	@Override
	public Object execute(HttpServletRequest request) {
		if (isGetAllReimbursements(request)) {
			
		} else if (isCreateReimbursement(request)) {
			
		} else if (isResolveReimbursement(request)) {
			
		} else if (isGetOneReimbursement(request)) {
			
		} else if (isGetReimbursementsByStatus(request)) {
			
		} else if (isGetReimbursementsByUsername(request)) {
			
		} 
		return null;
	}

	private boolean isGetAllReimbursements(HttpServletRequest request) {
		return request.getMethod().equals("GET") && request.getRequestURI().equals("/ERSDemo/api/reimbursements");
	}
	
	private boolean isCreateReimbursement(HttpServletRequest request) {
		return request.getMethod().equals("POST") && request.getRequestURI().equals("/ERSDemo/api/reimbursements");
	}
	
	private boolean isResolveReimbursement(HttpServletRequest request) {
		return request.getMethod().equals("PUT") && request.getRequestURI().equals("/ERSDemo/api/reimbursements");
	}
	
	private boolean isGetOneReimbursement(HttpServletRequest request) {
		return request.getMethod().equals("GET") && 
				request.getRequestURI().contains("/ERSDemo/api/reimbursements") &&
				request.getRequestURI().split("/").length == 5;
	}
	
	private boolean isGetReimbursementsByStatus(HttpServletRequest request) {
		return request.getMethod().equals("GET") && 
				request.getRequestURI().contains("/ERSDemo/api/reimbursements") &&
				request.getParameter("status") != null;
	}
	
	private boolean isGetReimbursementsByUsername(HttpServletRequest request) {
		return request.getMethod().equals("GET") && 
				request.getRequestURI().contains("/ERSDemo/api/reimbursements") &&
				request.getParameter("username") != null;
	}
}
