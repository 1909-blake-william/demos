package com.revature.models;

import java.util.Arrays;

public class PokemonType {

	private int id;
	private String name;
	private PokemonType[] weaknesses;
	private PokemonType[] resistances;

	public PokemonType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PokemonType(int id, String name, PokemonType[] weaknesses, PokemonType[] resistances) {
		super();
		this.id = id;
		this.name = name;
		this.weaknesses = weaknesses;
		this.resistances = resistances;
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

	public PokemonType[] getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(PokemonType[] weaknesses) {
		this.weaknesses = weaknesses;
	}

	public PokemonType[] getResistances() {
		return resistances;
	}

	public void setResistances(PokemonType[] resistances) {
		this.resistances = resistances;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(resistances);
		result = prime * result + Arrays.hashCode(weaknesses);
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
		PokemonType other = (PokemonType) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(resistances, other.resistances))
			return false;
		if (!Arrays.equals(weaknesses, other.weaknesses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + "]";
	}

}
