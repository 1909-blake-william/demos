package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.tasks.SimpleTask;

public class Driver {
	
	static List<Thread> tasks = new ArrayList<>();

	public static void main(String[] args) {
//		Thread t1 = new Thread(new SimpleTask());
		
		// Watch to see which thread name comes out
//		t1.run();
		
		for (int i = 0; i < 100; i++) {
			tasks.add(new Thread(new SimpleTask()));
		}
		
		// When we begin Thread execution with start(), we actually create a NEW thread
		// for the logic to execute. NOT from the invoking thread.
		tasks.forEach(task -> task.start());
	}
}
