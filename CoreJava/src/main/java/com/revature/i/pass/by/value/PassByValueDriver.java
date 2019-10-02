package com.revature.i.pass.by.value;

import com.revature.e.objects.Pencil;

public class PassByValueDriver {
	public static void passPrimitive(int i) {
		System.out.println("in passPrimitive, initially i = " + i);
		i += 1; // same as i = i + 1
		System.out.println("in passPrimitive i = " + i);
	}
	
	public static void passObject(Pencil p) {
		System.out.println("in passObject, initially p = " + p.getColor());
		p.setColor("changed");
		System.out.println("in passObject p = " + p.getColor());
	}

	public static void main(String[] args) {
		int i = 5;
		passPrimitive(i);
		System.out.println("in main i = " + i);
		
		Pencil p = new Pencil(true, "metal", true, true, "red", 2);
		passObject(p);
		System.out.println("in main p = " + p.getColor());
		
	}
}
