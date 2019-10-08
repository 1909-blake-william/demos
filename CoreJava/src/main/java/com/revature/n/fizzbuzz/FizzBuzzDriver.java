package com.revature.n.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzDriver {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}
		System.out.println("original: " + numbers);
		fizzBuzz(numbers);
	}

	public static void fizzBuzz(List<Integer> numbers) {
		System.out.print("after: [" );
		for(int number: numbers) {
			if(number % 3 == 0) {
				if(number % 5 == 0) {
					System.out.print("fizzbuzz, ");
				} else {
					System.out.print("fizz, ");
				}
			} else if (number % 5 == 0 ) {
				System.out.println("buzz, ");
			} else {
				System.out.print(number + ", ");
			}
		}
		System.out.print("");
		
	}
}
