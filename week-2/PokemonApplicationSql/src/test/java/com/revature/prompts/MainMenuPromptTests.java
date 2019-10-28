package com.revature.prompts;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainMenuPromptTests {

	private MainMenuPrompt mainMenu = new MainMenuPrompt();

	/**
	 * 
	 * @param input for the scanner that will be used by the main menu prompt
	 * @throws Exception
	 */
	private void replaceScanner(String input) throws Exception {
		Scanner scan = new Scanner(input);
		Field f = mainMenu.getClass().getDeclaredField("scan");
		f.setAccessible(true);
		f.set(mainMenu, scan);
	}

	@Test
	public void testCase1() throws Exception {
		replaceScanner("1\n");

		Prompt next = mainMenu.run();

		assertTrue(next instanceof ViewPokemonPrompt);

	}

	@Test
	public void testCase2() throws Exception {
		replaceScanner("2\n");

		Prompt next = mainMenu.run();

		assertTrue(next instanceof CreatePokemonPrompt);

	}

	@Test
	public void testCase3() throws Exception {
		replaceScanner("3\n");

		Prompt next = mainMenu.run();

		assertTrue(next instanceof FreePokemonPrompt);

	}

	@Test
	public void testCaseInvalidInput() throws Exception {
		replaceScanner("dslkjfa\n");

		Prompt next = mainMenu.run();

		assertTrue(next instanceof MainMenuPrompt);

	}

}
