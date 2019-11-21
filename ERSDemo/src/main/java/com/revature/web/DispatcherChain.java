package com.revature.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherChain implements Dispatcher, Registry {
	
	private final List<Dispatcher> dispatchers;
	private static final DispatcherChain instance = new DispatcherChain();
	
	private DispatcherChain() {
		this.dispatchers = new ArrayList<>();
		this.register(new AuthDispatcher());
		this.register(new ReimbursementDispatcher());
	}

	@Override
	public void register(Dispatcher dispatcher) {
		dispatchers.add(dispatcher);
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
