package com.revature.daos;

import java.util.List;

import com.revature.models.Pokemon;

public interface PokemonDao {

	PokemonDao currentImplementation = new PokemonDaoSerialization();

	/**
	 * used to save a new pokemon
	 * 
	 * @param p the pokemon to be created
	 * @return the generated id for the pokemon
	 */
	int save(Pokemon p);

	List<Pokemon> findAll();

	Pokemon findById();

	void release(int pokemonId);

}
