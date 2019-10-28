package com.revature.prompts;

import java.util.Scanner;

public class MainMenuPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {
		System.out.println("Welcome to Movie Application");
		System.out.println("Enter 1 to see movies");
		System.out.println("Enter 2 to register a new movie");
		System.out.println("Enter 3 to remove a movie");
		System.out.println("Enter 4 to view genres");
		System.out.println("Enter 5 to view directors");

		String selection = scan.nextLine();

		switch (selection) {
		case "1":
			System.out.println("Option 1 not yet implemented");
			break;
		case "2":
			return new CreateMoviePrompt();
		case "3":
			System.out.println("Option 3 not yet implemented");
			break;
		case "4":
			System.out.println("Option 4 not yet implemented");
			break;
		case "5":
			System.out.println("Option 5 not yet implemented");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
		return this;
	}

}
