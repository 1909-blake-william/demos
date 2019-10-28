package com.revature.u.threads;

public class SimpleRunnable implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Simple runnable is runnable");
		}
	}

}
