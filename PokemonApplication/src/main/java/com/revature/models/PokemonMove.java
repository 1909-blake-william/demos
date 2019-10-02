package com.revature.models;

public class PokemonMove {
	private int id;
	private String name;
	private PokemonType type;
	private int powerPoints;

	public PokemonMove() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PokemonMove(int id, String name, PokemonType type, int powerPoints) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.powerPoints = powerPoints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PokemonType getType() {
		return type;
	}

	public void setType(PokemonType type) {
		this.type = type;
	}

	public int getPowerPoints() {
		return powerPoints;
	}

	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + powerPoints;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		PokemonMove other = (PokemonMove) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (powerPoints != other.powerPoints)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PokemonMove [id=" + id + ", name=" + name + ", type=" + type + ", powerPoints=" + powerPoints + "]";
	}

}
