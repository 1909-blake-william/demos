package com.revature.driver;

import com.revature.prompts.LoginPrompt;
import com.revature.prompts.Prompt;

public class PokemonDriver {
	public static void main(String[] args) {
		Prompt p = new LoginPrompt();

		while (true) {
			p = p.run();
		}

	}
}
