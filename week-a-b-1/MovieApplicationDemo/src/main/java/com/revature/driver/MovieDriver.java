package com.revature.driver;

import com.revature.prompts.MainMenuPrompt;
import com.revature.prompts.Prompt;

public class MovieDriver {
	
	public static void main(String[] args) {
		Prompt currentPrompt = new MainMenuPrompt();
		while (true) {
			currentPrompt = currentPrompt.run();
		}
	}
}
