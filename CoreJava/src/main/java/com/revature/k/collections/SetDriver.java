package com.revature.k.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.revature.e.objects.Dog;

public class SetDriver {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(23);
		numbers.add(58);
		numbers.add(-300);
		numbers.add(5);
		numbers.add(9000);
		numbers.add(21);

		for (Integer number : numbers) {
			System.out.println(number);
		}

		Set<Dog> pets = new HashSet<>();
		pets.add(new Dog("George", 2, 2, "two", "bark"));

		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach"));
		pets.add(new Dog("Tim", 20, 1000, "programmer", "Code"));
		pets.add(new Dog("George", 2, 2, "two", "bark"));

		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach"));
		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach1"));
		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach2"));
		pets.add(new Dog("Bowser", 5, 250, "Turtle", "Stealing Princess Peach3"));

		for (Dog d : pets) {
			System.out.println(d);
		}
	}
}
