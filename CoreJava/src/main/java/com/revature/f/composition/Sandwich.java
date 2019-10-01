package com.revature.f.composition;

public class Sandwich {
	private Meat meat;
	private Cheese cheese;
	private Sauce sauce;

	public Sandwich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sandwich(Meat meat, Cheese cheese, Sauce sauce) {
		super();
		this.meat = meat;
		this.cheese = cheese;
		this.sauce = sauce;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cheese == null) ? 0 : cheese.hashCode());
		result = prime * result + ((meat == null) ? 0 : meat.hashCode());
		result = prime * result + ((sauce == null) ? 0 : sauce.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sandwich other = (Sandwich) obj;
		if (cheese == null) {
			if (other.cheese != null)
				return false;
		} else if (!cheese.equals(other.cheese))
			return false;
		if (meat == null) {
			if (other.meat != null)
				return false;
		} else if (!meat.equals(other.meat))
			return false;
		if (sauce == null) {
			if (other.sauce != null)
				return false;
		} else if (!sauce.equals(other.sauce))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sandwich [meat=" + meat + ", cheese=" + cheese + ", sauce=" + sauce + "]";
	}

}
