package com.reavture.g.arrays;

import java.util.Arrays;

import com.revature.e.objects.Pencil;

public class ArrayDriver {
	public static void main(String[] args) {
		int[] nums = new int[4];

		nums[1] = 32;
		nums[0] = 12;
		nums[2] = 42;
		nums[3] = 1002;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("index: " + i + " element: " + nums[i]);
		}
		System.out.println(Arrays.toString(nums));

		System.out.println("pencils");
		Pencil[] pencils = new Pencil[3];
		pencils[0] = new Pencil(false, "wood", true, true, "brown", 6);
		pencils[1] = new Pencil(true, "wood", true, false, "brown", 6);
		pencils[2] = new Pencil(false, "metal", true, true, "orange", 7);

		for (int i = 0; i < pencils.length; i++) {
			System.out.println("index: " + i + " element: " + pencils[i]);
		}
	}
}
