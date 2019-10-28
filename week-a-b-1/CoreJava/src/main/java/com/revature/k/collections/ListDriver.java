package com.revature.k.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.revature.e.objects.Dog;

public class ListDriver {
	public static void main(String[] args) {
//		List<Dog> pets = new ArrayList<>();
		List<Dog> pets = new LinkedList<>();
		pets.add(new Dog("George", 2, 2, "two", "bark"));
		pets.add(new Dog("Tim", 20, 1000, "programmer", "Code"));
		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach"));
		
//		for (Dog d : pets) {
//			System.out.println(d);
//		}
		
		Iterator<Dog> iterate = pets.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}

		pets.add(1, new Dog("Bill", 2, 10, "Shibu", "mop"));
		System.out.println("added another");
		for (Dog d : pets) {
			System.out.println(d);
		}
	}
}
