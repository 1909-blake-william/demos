package com.revature.tasks;

public class SimpleTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from " + Thread.currentThread().getName());
	}

}
