package com.revature.daos;

import java.util.List;

import com.revature.models.Pokemon;

public interface PokemonDao {

	PokemonDao currentImplementation = new PokemonDaoSQL();

	/**
	 * used to save a new pokemon
	 * 
	 * @param p the pokemon to be created
	 * @return the generated id for the pokemon
	 */
	int save(Pokemon p);

	List<Pokemon> findAll();

	List<Pokemon> findByName(String name);

	List<Pokemon> findByTypeId(int typeId);

	List<Pokemon> findByTrainerName(String name);

	Pokemon findById(int id);

	void release(int pokemonId);

}
