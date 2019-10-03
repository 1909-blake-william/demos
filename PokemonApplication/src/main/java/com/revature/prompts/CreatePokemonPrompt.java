package com.revature.prompts;

import java.util.List;
import java.util.Scanner;

import com.revature.daos.PokemonTypeDao;
import com.revature.models.Pokemon;
import com.revature.models.PokemonType;

public class CreatePokemonPrompt implements Prompt {

	private PokemonTypeDao pokemonTypesDao = PokemonTypeDao.currentImplementation;

	@Override
	public Prompt run() {
		List<PokemonType> types = pokemonTypesDao.findAll();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pokemon name: ");
		String name = scan.nextLine();
		System.out.println("Select pokemon type from the following: ");
		for (int i = 0; i < types.size(); i++) {
			System.out.println("Enter " + i + " for " + types.get(i).getName());
		}
		int typeSelection = scan.nextInt();
		PokemonType type = types.get(typeSelection);
		scan.reset(); // reset scanner after getting numbers

		System.out.println("Enter health points");
		int healthPoints = scan.nextInt();
		scan.reset();

		System.out.println("Enter level");
		int level = scan.nextInt();
		scan.reset();

		Pokemon p = new Pokemon(1, name, level, healthPoints, type, null);
		System.out.println(p);
		return new MainMenuPrompt();
	}

}
