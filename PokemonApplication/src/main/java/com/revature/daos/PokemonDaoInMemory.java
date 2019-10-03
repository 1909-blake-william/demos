package com.revature.daos;

import com.revature.models.Pokemon;

public class PokemonDaoInMemory implements PokemonDao {

	@Override
	public int save(Pokemon p) {
		System.out.println("saved " + p);
		return 0;
	}

	@Override
	public Pokemon[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release(int pokemonId) {
		// TODO Auto-generated method stub
		
	}

}
