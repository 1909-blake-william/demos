package com.revature.e.objects;

public class AnimalDriver {
	public static void main(String[] args) {
		Dog d = new Dog("Bob", 2, 80, "Golden Retriever", "Being a good boi");
		System.out.println(d);
		Sloth s = new Sloth("Slaking", 5, 100, false, 2, true);
		System.out.println(s);
	}
}
