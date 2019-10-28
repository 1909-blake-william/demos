package com.revature.e.objects;

public class Sloth extends Animal {
	private boolean sleepy;
	private double clawLength;
	private boolean canSwim;
	public Sloth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sloth(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}
	public Sloth(String name, double height, double weight, boolean sleepy, double clawLength, boolean canSwim) {
		super(name, height, weight);
		this.sleepy = sleepy;
		this.clawLength = clawLength;
		this.canSwim = canSwim;
	}
	public boolean isSleepy() {
		return sleepy;
	}
	public void setSleepy(boolean sleepy) {
		this.sleepy = sleepy;
	}
	public double getClawLength() {
		return clawLength;
	}
	public void setClawLength(double clawLength) {
		this.clawLength = clawLength;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (canSwim ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(clawLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (sleepy ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sloth other = (Sloth) obj;
		if (canSwim != other.canSwim)
			return false;
		if (Double.doubleToLongBits(clawLength) != Double.doubleToLongBits(other.clawLength))
			return false;
		if (sleepy != other.sleepy)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Sloth [sleepy=" + sleepy + ", clawLength=" + clawLength + ", canSwim=" + canSwim + ", name=" + name
				+ ", height=" + height + ", weight=" + weight + "]";
	}
}
