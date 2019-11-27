package com.revature.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class DispatcherChain implements Dispatcher {
	
	private final List<Dispatcher> dispatchers;
	private static final DispatcherChain instance = new DispatcherChain();
	
	private DispatcherChain() {
		this.dispatchers = new ArrayList<>();
		this.dispatchers.add(new AuthDispatcher());
		this.dispatchers.add(new ReimbursementDispatcher());
	}

	@Override
	public boolean supports(HttpServletRequest request) {
		for (Dispatcher d : dispatchers) {
			if (d.supports(request)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		for (Dispatcher d : dispatchers) {
			if (d.supports(request)) {
				d.execute(request, response);
			}
		}
	}

	public static DispatcherChain getInstance() {
		return instance;
	}
}
