package com.revature.prompts;

public interface Prompt {
	/**
	 * Starts the prompt and runs its functionality
	 * when it is done it will return the next prompt to go to
	 * @return the next prompt
	 */
	Prompt run();
}
