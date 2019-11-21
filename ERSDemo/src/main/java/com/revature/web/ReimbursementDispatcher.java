package com.revature.web;

import com.revature.dao.ReimbursementDao;
import com.revature.dao.ReimbursementDaoImpl;
import com.revature.handler.ReimbursementHandler;
import com.revature.model.Reimbursement;
import com.revature.model.ReimbursementForm;
import com.revature.util.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ReimbursementDispatcher implements Dispatcher {

	private final Logger logger = LogManager.getLogger(getClass());

	// Constructor with the package-private access
	ReimbursementDispatcher() {
	}

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
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		if (isGetAllReimbursements(request)) {
			ReimbursementHandler.handleGetAllReimbursementsRequest(request, response);
		} else if (isCreateReimbursement(request)) {
			ReimbursementHandler.handleCreateReimbursementRequest(request, response);
		} else if (isResolveReimbursement(request)) {
			ReimbursementHandler.handleReimbursementResolution(request, response);
		} else if (isGetOneReimbursement(request)) {
			
		} else if (isGetReimbursementsByStatus(request)) {
			
		} else if (isGetReimbursementsByUsername(request)) {
			
		}
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
