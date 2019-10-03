package com.revature.daos;

import com.revature.models.Pokemon;

public interface PokemonDao {
	/**
	 * used to save a new pokemon
	 * @param p the pokemon to be created
	 * @return the generated id for the pokemon
	 */
	int save(Pokemon p);
	
	Pokemon[] findAll();
	
	Pokemon findById();
	
	void release(int pokemonId);
	
}
