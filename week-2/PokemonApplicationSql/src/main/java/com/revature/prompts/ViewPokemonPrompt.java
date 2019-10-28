package com.revature.prompts;

import java.util.List;

import com.revature.daos.PokemonDao;
import com.revature.models.Pokemon;

public class ViewPokemonPrompt implements Prompt {

	private PokemonDao pokeDao = PokemonDao.currentImplementation;

	@Override
	public Prompt run() {
		List<Pokemon> allPokemon = pokeDao.findAll();
		for(Pokemon p: allPokemon) {
			System.out.println(p);
		}
		return new MainMenuPrompt();
	}

}
