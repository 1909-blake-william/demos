package com.revature.daos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.PokemonType;

public class PokemonTypeDaoSerialization implements PokemonTypeDao {

	@Override
	public int save(PokemonType pokemonType) {

		// get all pokemon types from the file
		List<PokemonType> allPokemonTypes = findAll();

		// try with resources will auto close variables such as file streams
		try (ObjectOutputStream outStream = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/pokemon-types.txt"))) {

			// generate random id
			int randomId = (int) Math.floor(Math.random() * 1000000) + 1;
			pokemonType.setId(randomId);
			allPokemonTypes.add(pokemonType);

			// save pokemon back to the file
			outStream.writeObject(allPokemonTypes);
			return randomId;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PokemonType> findAll() {
		try (ObjectInputStream inStream = new ObjectInputStream(
				new FileInputStream("src/main/resources/pokemon-types.txt"))) {

			List<PokemonType> pokemon = (List<PokemonType>) inStream.readObject();
			return pokemon;

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return new ArrayList<PokemonType>();
		} // TODO Auto-generated method stub
	}

	@Override
	public PokemonType findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PokemonType findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
