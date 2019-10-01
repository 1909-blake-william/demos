package com.revature.e.objects;

public class Pencil {
	// the first 2 fields should also be private but i left just for demo sake
	boolean isMechanical;
	public String material;
	
	private boolean isSharp;
	private boolean hasEraser;
	private String color;
	private int hardness;
	
	public Pencil(boolean isMechanical, String material, boolean isSharp, boolean hasEraser, String color,
			int hardness) {
		super();
		this.isMechanical = isMechanical;
		this.material = material;
		this.isSharp = isSharp;
		this.hasEraser = hasEraser;
		this.color = color;
		this.hardness = hardness;
	}
	
	public Pencil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isMechanical() {
		return isMechanical;
	}

	public void setMechanical(boolean isMechanical) {
		this.isMechanical = isMechanical;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isSharp() {
		return isSharp;
	}

	public void setSharp(boolean isSharp) {
		this.isSharp = isSharp;
	}

	public boolean isHasEraser() {
		return hasEraser;
	}

	public void setHasEraser(boolean hasEraser) {
		this.hasEraser = hasEraser;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		if(hardness > 0 && hardness <= 10) {
			this.hardness = hardness;
		} else {
			System.out.println("invalid hardness, value not updated");
		}
	}

	@Override
	public String toString() {
		return "Pencil [isMechanical=" + isMechanical + ", material=" + material + ", isSharp=" + isSharp
				+ ", hasEraser=" + hasEraser + ", color=" + color + ", hardness=" + hardness + "]";
	}
	
	
	
}
