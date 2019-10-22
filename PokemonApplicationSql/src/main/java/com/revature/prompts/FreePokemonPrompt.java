package com.revature.prompts;

public class FreePokemonPrompt implements Prompt {

	@Override
	public Prompt run() {
		// TODO Auto-generated method stub
		System.out.println("Free Pokemon not yet functional");
		return new MainMenuPrompt();
	}

}
