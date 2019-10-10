package com.revature.o.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceDriver {
	public static void main(String[] args) {
//		System.out.println(fibonacci(5));
		System.out.println(fibRecursive(20));
	}
	
	public static int fibRecursive(int n) {
		if(n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		
		return fibRecursive(n - 1) + fibRecursive(n - 2);
	}
	

	public static List<Integer> fibonacci(int numberElements) {
		List<Integer> sequence = new ArrayList<Integer>();
		if (numberElements < 0) {
			return null;
		} else if (numberElements == 1) {
			sequence.add(0);
		} else if (numberElements == 2) {
			sequence.add(0);
			sequence.add(1);
		} else {
			sequence.add(0);
			sequence.add(1);
			for (int eleNumber = 3; eleNumber <= numberElements; eleNumber++) {
				sequence.add(sequence.get(eleNumber - 3) + sequence.get(eleNumber - 2));
			}
		}
		return sequence;
	}
}
