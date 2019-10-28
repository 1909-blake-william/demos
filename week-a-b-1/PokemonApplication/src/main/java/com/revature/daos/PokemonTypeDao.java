package com.revature.daos;

import java.util.List;

import com.revature.models.PokemonType;

public interface PokemonTypeDao {

	// implicitly public static final for fields

	PokemonTypeDao currentImplementation = new PokemonTypeDaoSerialization();

	int save(PokemonType pokemonType);

	List<PokemonType> findAll();

	PokemonType findById();

	PokemonType findByName(String name);
}
