package com.revature.c;

public class FlowOfControlDriver {
	
	public static void main(String[] args) {
		
		// if statement is for decision making to determing which route to go
		int selection = 11;
		if(selection == 10) {
			System.out.println("doing good");
		} else if(selection < 0) {
			System.out.println("doing bad");
		} else if (selection > 10) {
			System.out.println("doing really good");
		} else {
			System.out.println("doing too good");
		}
		
		
		
		double random = 0;
		// use if you don't know number of iterations
		// might never loop
		while(random != 5) {
			System.out.println("random is not 5 it is: " + random);
			random = Math.floor(Math.random() * 11);
		}
		System.out.println("random is now: " + random);
		
		// use if you don't know the number of iterations but you want
		// at least one loop
		do {
			System.out.println("random is: " + random);
			random = Math.floor(Math.random() * 11);
		} while (random != 5);
		
		// use a for loop if you know the exact number of times you want to iterate
		for(int i = 0; i <100; i++) {
			System.out.println("i = " + i);
		}
	}
}
