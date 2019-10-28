package com.revature.j.strings;

import java.util.Arrays;

public class StringDriver {
	public static void main(String[] args) {
		String str = "hello";
		
		String str2 = "hello";
		System.out.println(str == str2);
		
		str = str.concat(" world");
		System.out.println(str);
		
		String str3 = "hello world";
		str = str.intern();
		System.out.println(str == str3);
		
		System.out.println(str.endsWith("ld"));
		
		System.out.println(Arrays.toString(str.split(" ")));
		
		System.out.println(str.substring(3, 7));
	}
}
