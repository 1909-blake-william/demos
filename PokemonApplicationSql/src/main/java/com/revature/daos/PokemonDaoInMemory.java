package com.revature.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.models.Pokemon;
import com.revature.models.PokemonMove;

public class PokemonDaoInMemory implements PokemonDao {

	private List<Pokemon> pokemon = new ArrayList<Pokemon>();
	private PokemonTypeDao pokemonTypeDao = PokemonTypeDao.currentImplementation;
	private PokemonMovesDao pokemonMovesDao = PokemonMovesDao.currentImplementation;

	public PokemonDaoInMemory() {
		super();
		save(new Pokemon(0, "Zero", 0, 0, null, new ArrayList<PokemonMove>()));
		save(new Pokemon(0, "Eggy", 3, 15, pokemonTypeDao.findByName("Grass"),
				Arrays.asList(new PokemonMove[] { pokemonMovesDao.findById(5), pokemonMovesDao.findById(30) })));
	}

	@Override
	public int save(Pokemon p) {
		int randomId = (int) Math.floor(Math.random() * 1000000) + 1;
		p.setId(randomId);
		pokemon.add(p);
		return randomId;
	}

	@Override
	public List<Pokemon> findAll() {
		return pokemon;
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
