package com.revature.driver;

import com.revature.daos.PokemonDao;
import com.revature.daos.UserDao;

public class ManualTestDriver {
	public static void main(String[] args) {

		UserDao userDao = UserDao.currentImplementation;
		PokemonDao pokeDao = PokemonDao.currentImplementation;

		// find all
//		List<User> users = userDao.findAll();
//		users.forEach(user -> {
//			System.out.println(user);
//		});

		// all pokemon
		System.out.println("all pokemon");
		pokeDao.findAll().forEach(pokemon -> {
			System.out.println(pokemon);
		});

		// pokemon by id
		int pokeId = 2;
		System.out.println("pokemon with id: " + pokeId);
		System.out.println(pokeDao.findById(pokeId));

		// pokemon by type
		int typeId = 2;
		System.out.println("pokemon with typeid: " + typeId);
		pokeDao.findByTypeId(typeId).forEach(pokemon -> {
			System.out.println(pokemon);
		});

		// pokemon by name
		String pokeName = "Eevee";
		System.out.println("pokemon with name: " + pokeName);
		pokeDao.findByName(pokeName).forEach(pokemon -> {
			System.out.println(pokemon);
		});
	}
}
