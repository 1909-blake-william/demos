package com.revature.daos;

import java.util.List;

import com.revature.models.PokemonType;

public interface PokemonTypeDao {

	// implicitly public static final for fields

	PokemonTypeDao currentImplementation = new PokemonTypeDaoSQL();

	int save(PokemonType pokemonType);

	List<PokemonType> findAll();

	List<PokemonType> findResistances(int typeId);

	List<PokemonType> findWeaknesses(int typeId);

	PokemonType findById();

	PokemonType findByName(String name);
}
