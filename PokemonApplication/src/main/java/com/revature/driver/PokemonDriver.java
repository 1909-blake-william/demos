package com.revature.driver;

import com.revature.prompts.MainMenuPrompt;
import com.revature.prompts.Prompt;

public class PokemonDriver {
	public static void main(String[] args) {
		Prompt p = new MainMenuPrompt();

		while (true) {
			p = p.run();
		}

	}
}
