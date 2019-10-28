package com.revature.e.objects;

public class Dog extends Animal {
	private String breed;
	private String job;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, double height, double weight, String breed, String job) {
		super(name, height, weight);
		this.breed = breed;
		this.job = job;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
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
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", job=" + job + ", name=" + name + ", height=" + height + ", weight=" + weight
				+ "]";
	}

}
