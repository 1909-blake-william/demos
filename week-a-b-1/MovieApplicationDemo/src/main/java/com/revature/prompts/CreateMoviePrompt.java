package com.revature.prompts;

import java.util.Scanner;

public class CreateMoviePrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {
		System.out.println("Enter movie Title");
		String title = scan.nextLine();

		System.out.println("Enter movie Director");
		String director = scan.nextLine();

		System.out.println("Enter movie description");
		String description = scan.nextLine();

		System.out.println("created");
		return new MainMenuPrompt();
	}

}
