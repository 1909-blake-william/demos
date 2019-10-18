package com.revature.driver;

import org.apache.log4j.Logger;

import com.revature.prompts.LoginPrompt;
import com.revature.prompts.Prompt;

public class PokemonDriver {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		Prompt p = new LoginPrompt();

		while (true) {
			log.debug("starting prompt of type: " + p.getClass());
			p = p.run();
			log.debug("next prompt is of type: " + p.getClass());
		}

	}
}
