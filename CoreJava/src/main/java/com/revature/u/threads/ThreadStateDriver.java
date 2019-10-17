package com.revature.u.threads;

public class ThreadStateDriver {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
				while(true) {
					
				}
		});
		System.out.println(t1.getState()); // should be new
		t1.start();
		System.out.println(t1.getState());  // should be runnable (currently running)
		
		
		Thread t2 = new Thread(() ->  {
			System.out.println("sleeping thread starting and going to sleep now");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sleeping thread done");
		});
		
		t2.start();
		Thread.sleep(500);
		System.out.println(t2.getState());
		
		
		Thread t3 = new Thread(() -> {
			blockingMethod();
		});
		t3.start();
		Thread t4 = new Thread(() -> {
			blockingMethod();
		});
		t4.start();
		Thread.sleep(500);
		System.out.println("t3 state: " + t3.getState());
		System.out.println("t4 state: " + t4.getState());
		
		
		Thread t5 = new Thread(() -> { 
			System.out.println("joining on t2");
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("join ended");
		});
		
		t5.start();
		Thread.sleep(500);
		System.out.println(t5.getState());
		
		Thread.sleep(5000);
		System.out.println(t5.getState());
		
		
		
	}
	
	private static synchronized void blockingMethod() {
		System.out.println("blocking started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("blocking ended");
	}
	
	
}
