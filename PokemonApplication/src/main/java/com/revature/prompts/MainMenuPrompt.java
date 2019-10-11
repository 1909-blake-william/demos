package com.revature.prompts;

import java.util.Scanner;

public class MainMenuPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {

		System.out.println("Welcome, please choose an option");
		System.out.println("Enter 1 to view pokemon");
		System.out.println("Enter 2 to create pokemon");
		System.out.println("Enter 3 to free pokemon");

		// get user input
		String selection = scan.nextLine();

		switch (selection) {
		case "1":
			return new ViewPokemonPrompt();
		case "2":
			return new CreatePokemonPrompt();
		case "3":
			return new FreePokemonPrompt();
		default:
			System.out.println("invalid selection, try again.");
			break;
		}
		return this;
	}

}
