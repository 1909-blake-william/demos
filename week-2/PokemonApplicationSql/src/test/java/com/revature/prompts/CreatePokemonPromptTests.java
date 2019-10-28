package com.revature.prompts;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.daos.PokemonDao;
import com.revature.daos.PokemonTypeDao;
import com.revature.models.Pokemon;
import com.revature.models.PokemonType;

@RunWith(MockitoJUnitRunner.class)
public class CreatePokemonPromptTests {


	@Mock
	private PokemonTypeDao pokemonTypesDao;

	@Mock
	private PokemonDao pokemonDao;

	@InjectMocks
	private CreatePokemonPrompt createPrompt;

	private List<PokemonType> types;

	@Before
	public void setup() {
		types = new ArrayList<PokemonType>();
		types.add(new PokemonType(1, "Bug", null, null));
		types.add(new PokemonType(2, "Fire", null, null));
		types.add(new PokemonType(3, "Ghost", null, null));
		types.add(new PokemonType(4, "Water", null, null));
		Mockito.when(pokemonTypesDao.findAll()).thenReturn(types);

	}

	@Test
	public void testValidInputs() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Scanner scan = new Scanner("Mewtwo\n" + "0\n" + "30\n" + "5\n");
		
		// replace the scanner on the prompt with this scanner
		Field field = createPrompt.getClass().getDeclaredField("scan");
		field.setAccessible(true);
		field.set(createPrompt, scan);

		Pokemon pokemon = new Pokemon(0, "Mewtwo", 5, 30, types.get(0), null);
		Mockito.when(pokemonDao.save(pokemon)).thenReturn(23432);

		Prompt next = createPrompt.run();

		assertTrue(next instanceof MainMenuPrompt);
		Mockito.verify(pokemonDao, Mockito.times(1)).save(pokemon);
	}

}
