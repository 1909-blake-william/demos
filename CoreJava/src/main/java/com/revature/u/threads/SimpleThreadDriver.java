package com.revature.u.threads;

public class SimpleThreadDriver {
	public static void main(String[] args) {
		Thread t = new SimpleThread();
		t.start();

		Thread t1 = new Thread(new SimpleRunnable());
		t1.start();

		while (true) {
			System.out.println("Main thread runnable");
		}
	}
}
