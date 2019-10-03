package com.revature.daos;

import java.util.List;

import com.revature.models.PokemonMove;

public interface PokemonMovesDao {
	int save(PokemonMove move);
	List<PokemonMove> findAll();
	List<PokemonMove> findByTypeName(String typeName);
}
