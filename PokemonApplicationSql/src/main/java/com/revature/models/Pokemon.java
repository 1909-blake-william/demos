package com.revature.models;

import java.io.Serializable;

public class Pokemon implements Serializable {
	private int id;
	private String name;
	private int level;
	private int healthPoints;
	private PokemonType type;
	private User trainer;

	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pokemon(int id, String name, int level, int healthPoints, PokemonType type, User trainer) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
		this.type = type;
		this.trainer = trainer;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public PokemonType getType() {
		return type;
	}

	public void setType(PokemonType type) {
		this.type = type;
	}

	public User getTrainer() {
		return trainer;
	}

	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + healthPoints;
		result = prime * result + id;
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
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
		Pokemon other = (Pokemon) obj;
		if (healthPoints != other.healthPoints)
			return false;
		if (id != other.id)
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
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
		return "Pokemon [id=" + id + ", name=" + name + ", level=" + level + ", healthPoints=" + healthPoints
				+ ", type=" + type + ", trainer=" + trainer + "]";
	}

}
