package com.revature.e.objects;

/**
 * This is the pencil class used to model an actual pencil
 * 
 * @author btkru
 *
 */
public class Pencil implements Comparable<Pencil> {
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

	/**
	 * Used to set whether the pencil is mechanical or not
	 * 
	 * @param isMechanical
	 */
	public void setMechanical(boolean isMechanical) {
		this.isMechanical = isMechanical;
	}

	/**
	 * 
	 * @return the current material the pencil is made of
	 */
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
		if (hardness > 0 && hardness <= 10) {
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

	@Override
	public int compareTo(Pencil o) {
		int order = this.getHardness() - o.getHardness();
		if (order == 0) {
			Boolean mechanical = this.isMechanical;
			order = mechanical.compareTo(o.isMechanical());
		}
		return order;
	}

}
