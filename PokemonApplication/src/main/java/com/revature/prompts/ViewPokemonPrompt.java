package com.revature.prompts;

public class ViewPokemonPrompt implements Prompt {

	@Override
	public Prompt run() {
		// TODO Auto-generated method stub
		System.out.println("View Pokemon not yet functional");
		return new MainMenuPrompt();
	}

}
