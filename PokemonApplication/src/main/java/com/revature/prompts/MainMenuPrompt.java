package com.revature.prompts;

import java.util.List;
import java.util.Scanner;

import com.revature.daos.PokemonDao;
import com.revature.daos.PokemonTypeDao;
import com.revature.models.Pokemon;
import com.revature.models.PokemonType;

public class MainMenuPrompt implements Prompt {
	private PokemonTypeDao pokemonTypesDao = PokemonTypeDao.currentImplementation;
	private PokemonDao pokemonDao = PokemonDao.currentImplementation;

	@Override
	public Prompt run() {
		List<PokemonType> types = pokemonTypesDao.findAll();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, please choose an option");
		System.out.println("Enter 1 to view pokemon");
		System.out.println("Enter 2 to create pokemon");
		System.out.println("Enter 3 to free pokemon");

		// get user input
		String selection = scan.nextLine();

		switch (selection) {
		case "1":
			List<Pokemon> pokemon = pokemonDao.findAll();
			for(Pokemon p: pokemon) {
				System.out.println(p);
			}
			break;
		case "2":
			return new CreatePokemonPrompt();
		case "3":
			System.out.println("free not yet implemented");
			break;
		default:
			System.out.println("invalid selection, try again.");
			break;
		}
		return this;
	}

}
