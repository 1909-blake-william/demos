package com.revature.models;

import java.util.List;

public class PokemonType {

	private int id;
	private String name;
	private List<PokemonType> weaknesses;
	private List<PokemonType> resistances;

	public PokemonType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PokemonType(int id, String name, List<PokemonType> weaknesses, List<PokemonType> resistances) {
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

	public List<PokemonType> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(List<PokemonType> weaknesses) {
		this.weaknesses = weaknesses;
	}

	public List<PokemonType> getResistances() {
		return resistances;
	}

	public void setResistances(List<PokemonType> resistances) {
		this.resistances = resistances;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((resistances == null) ? 0 : resistances.hashCode());
		result = prime * result + ((weaknesses == null) ? 0 : weaknesses.hashCode());
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
		if (resistances == null) {
			if (other.resistances != null)
				return false;
		} else if (!resistances.equals(other.resistances))
			return false;
		if (weaknesses == null) {
			if (other.weaknesses != null)
				return false;
		} else if (!weaknesses.equals(other.weaknesses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PokemonType [id=" + id + ", name=" + name + "]";
	}

}
