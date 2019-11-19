package com.revature.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class DispatcherChain implements Dispatcher, Registry {
	
	private final List<Dispatcher> dispatchers;
	private static final DispatcherChain instance = new DispatcherChain();
	
	private DispatcherChain() {
		this.dispatchers = new ArrayList<>();
		this.register(AuthDispatcher.getInstance());
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
	public Object execute(HttpServletRequest request) {
		for (Dispatcher d : dispatchers) {
			if (d.supports(request)) {
				return d.execute(request);
			}
		}
		return null;
	}

	public static DispatcherChain getInstance() {
		return instance;
	}
}
