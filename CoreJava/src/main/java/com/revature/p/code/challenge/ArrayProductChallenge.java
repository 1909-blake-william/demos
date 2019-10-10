package com.revature.p.code.challenge;

import java.util.Arrays;

public class ArrayProductChallenge {
	
	public static void main(String[] args) {
		int[] testData = new int[] {2, 1, 3};
		int[] result = solution(testData);
		System.out.println(Arrays.toString(result));
	}
	
	
	/**
	 * 
	 * @param original an array of number provided must be length 2 or greater
	 * @return an array the same length as the original
	 * but each element is the product of all elements in the original array
	 * except the element at that index
	 */
	public static int[] solution(int[] original) {
		// problem statement doesn't really work for less than 2 elements
		if(original.length <= 1) {
			return null;
		}
		int[] result = new int[original.length];
		int[] leftProducts = createLeftProducts(original);
		System.out.println(Arrays.toString(leftProducts));
		int[] rightProducts = createRightProducts(original);
		System.out.println(Arrays.toString(rightProducts));
		
		// populate first value
		result[0] = rightProducts[0]; 
		
		// populate last value
		result[result.length - 1] = leftProducts[leftProducts.length - 1]; 
		
		// populate all other values
		for(int i = 1; i < result.length - 1; i ++) {
			result[i] = leftProducts[i -1] * rightProducts[i];
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param original, must have length greater than or equal to 2
	 * @return an array where each element is the product of all elements in the 
	 * original array after the index element. does not include the first element
	 * 
	 * ex: [1,2,3,4] => [24,12,4]
	 */
	private static int[] createRightProducts(int[] original) {
		int[] rightProducts = new int[original.length - 1];
		rightProducts[rightProducts.length - 1] = original[original.length-1];
		for(int i = 1; i < rightProducts.length; i++) {
			rightProducts[rightProducts.length - 1 - i] = rightProducts[rightProducts.length - i] * original[rightProducts.length - i];
		}
		return rightProducts;
	}

	/**
	 * 
	 * @param original, must have length greater than or equal to 2
	 * @return an array where each element is the product of all elements in the 
	 * original array up to and including that index. Does not include the last element
	 * 
	 * ex: [1,2,3,4] => [1,2,6]
	 */
	private static int[] createLeftProducts(int[] original) {
		int[] leftProducts = new int[original.length - 1];
		leftProducts[0] = original[0];
		for(int i = 1; i < leftProducts.length; i++) {
			leftProducts[i] = leftProducts[i - 1] * original[i];
		}
		return leftProducts;
	}
	
	
}
