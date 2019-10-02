package com.revature.e.objects;

public class PencilDriver {
	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.setColor("blue");
		p.setHardness(2);
		p.setHasEraser(false);
		p.isMechanical = false;
		p.setSharp(true);
		
		
		// material is not properly encapsulated because we are interracting with it directly
		p.material = "Wood";
		
		System.out.println(p);
		
		Pencil p2 = new Pencil(true, "metal", false, true, "red", 1);
		System.out.println(p2);
	}
}
