package com.revature.prompts;

import java.util.List;
import java.util.Scanner;

import com.revature.daos.PokemonDao;
import com.revature.daos.PokemonTypeDao;
import com.revature.models.Pokemon;
import com.revature.models.PokemonType;

public class CreatePokemonPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private PokemonTypeDao pokemonTypesDao = PokemonTypeDao.currentImplementation;
	private PokemonDao pokemonDao = PokemonDao.currentImplementation;

	@Override
	public Prompt run() {
		List<PokemonType> types = pokemonTypesDao.findAll();
		System.out.println("Enter pokemon name: ");
		String name = scan.nextLine();
		System.out.println("Select pokemon type from the following: ");
		for (int i = 0; i < types.size(); i++) {
			System.out.println("Enter " + i + " for " + types.get(i).getName());
		}
		int typeSelection = scan.nextInt();
		PokemonType type = types.get(typeSelection);
		scan.nextLine(); // reset scanner after getting numbers

		System.out.println("Enter health points");
		int healthPoints = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter level");
		int level = scan.nextInt();
		scan.nextLine();

		Pokemon p = new Pokemon(0, name, level, healthPoints, type, null);
		pokemonDao.save(p);
		return new MainMenuPrompt();
	}

}
