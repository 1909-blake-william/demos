package com.revature.u.threads;

public class SimpleThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("simple thread runnable");
		}
	}

}
