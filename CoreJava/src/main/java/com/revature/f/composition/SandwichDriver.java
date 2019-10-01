package com.revature.f.composition;

public class SandwichDriver {
	public static void main(String[] args) {
		Sandwich s = new Sandwich(
					new Meat(120, "white", "turkey"), 
					new Cheese(1000, "yellow"), 
					new Sauce(50, "blue", 4.20));
		
		System.out.println(s);
	}
}
