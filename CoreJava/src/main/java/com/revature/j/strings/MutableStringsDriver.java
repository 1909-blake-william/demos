package com.revature.j.strings;

public class MutableStringsDriver {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("safe");
		sb.append("ty Dance");
		
		sb.delete(2, 9);

		System.out.println(sb);
	}
}
