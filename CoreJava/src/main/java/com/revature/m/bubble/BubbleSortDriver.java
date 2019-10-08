package com.revature.m.bubble;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortDriver {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(52);
		numbers.add(81);
		numbers.add(2);
		numbers.add(30);
		numbers.add(23);
		System.out.println("before: " + numbers);
		System.out.println("after:" + bubbleSort(numbers));
		
	}

	public static List<Integer> bubbleSort(List<Integer> numbers) {
		boolean swap;
		// loop for max number of iterations for the sort
		for (int i = 0; i < numbers.size(); i++) {
			swap = false;
			// loop for going through the array on each iteration
			for (int j = 0; j < numbers.size() - 1 - i; j++) {
				int one = numbers.get(j);
				int two = numbers.get(j + 1);
				// if one is greater than two we need to swap them in the list
				if (one > two) {
					numbers.set(j, two);
					numbers.set(j + 1, one);
					swap = true;
				}
			}
			// if no swap occurred we know it is fully sorted and can end
			if(!swap) {
				return numbers;
			}
		}
		return numbers;

	}

}
