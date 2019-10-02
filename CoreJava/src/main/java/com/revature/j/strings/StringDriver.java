package com.revature.j.strings;

import java.util.Arrays;

public class StringDriver {
	public static void main(String[] args) {
		String str = "hello";
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.endsWith("ld"));
		
		System.out.println(Arrays.toString(str.split(" ")));
		
		System.out.println(str.substring(3, 7));
	}
}
