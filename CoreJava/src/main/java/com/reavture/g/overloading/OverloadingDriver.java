package com.reavture.g.overloading;

public class OverloadingDriver {
	
	public static void main(String[] args) {
		OverloadingDriver overloading = new OverloadingDriver();
		overloading.add(5, 5, 10);
		
	}
	
	public int add(int one, int two) {
		System.out.println("int one and int two called");
		return one + two;
	}
	
	public int add(int one, int two, int three) {
		System.out.println("int one, int two, int three called");
		return one + two + three;
	}
	
	public long add(int one, long two) {
		System.out.println("int one and long two");
		return one + two;
	}
}
