package com.revature.daos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Pokemon;

public class PokemonDaoSerialization implements PokemonDao {

	@Override
	public int save(Pokemon pokemon) {

		// get all pokemon from the file
		List<Pokemon> allPokemon = findAll();

		// try with resources will auto close variables such as file streams
		try (ObjectOutputStream outStream = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/pokemon.txt"))) {

			// generate random id
			int randomId = (int) Math.floor(Math.random() * 1000000) + 1;
			pokemon.setId(randomId);
			allPokemon.add(pokemon);

			// save pokemon back to the file
			outStream.writeObject(allPokemon);
			return randomId;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Pokemon> findAll() {
		try (ObjectInputStream inStream = new ObjectInputStream(
				new FileInputStream("src/main/resources/pokemon.txt"))) {

			List<Pokemon> pokemon = (List<Pokemon>) inStream.readObject();
			return pokemon;

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return new ArrayList<Pokemon>();
		} // TODO Auto-generated method stub
	}

	@Override
	public Pokemon findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release(int pokemonId) {
		// TODO Auto-generated method stub

	}

}
