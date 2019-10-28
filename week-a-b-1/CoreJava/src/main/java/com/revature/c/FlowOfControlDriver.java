package com.revature.c;

public class FlowOfControlDriver {

	public static void ifDemo(int selection) {
		// if statement is for decision making to determining which route to go
		if (selection == 10) {
			System.out.println("doing good");
		} else if (selection < 0) {
			System.out.println("doing bad");
		} else if (selection > 10) {
			System.out.println("doing really good");
		} else {
			System.out.println("doing too good");
		}
	}

	public static void whileDemo() {
		double random = 0;
		// use if you don't know number of iterations
		// might never loop
		while (random != 5) {
			System.out.println("random is not 5 it is: " + random);
			random = Math.floor(Math.random() * 11);
		}
		System.out.println("random is now: " + random);
	}

	public static void doWhileDemo() {
		double random = 0;
		// use if you don't know the number of iterations but you want
		// at least one loop
		do {
			System.out.println("random is: " + random);
			random = Math.floor(Math.random() * 11);
		} while (random != 5);
	}

	public static void forDemo(int iterations) {
		// use a for loop if you know the exact number of times you want to iterate
		for (int i = 0; i < iterations; i++) {
			System.out.println("i = " + i);
		}
	}
	
	public static void switchDemo(int selection) {
		switch (selection) {
		case 2:
			System.out.println("you got it");
			break;
		case 3:
			System.out.println("this is not 2");
			break;
		case 1:
			System.out.println("this is also not 2");
			break;
		default:
			System.out.println("what are you doing????");
			break;
		}
	}

	public static void main(String[] args) {
		ifDemo(5);
		whileDemo();
		doWhileDemo();
		forDemo(20);
		switchDemo(5);
		forDemo(5);
	}
}
