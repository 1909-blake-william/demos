package com.revature.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.models.PokemonType;

public class PokemonTypeDaoInMemory implements PokemonTypeDao {

	private List<PokemonType> pokemonTypes;

	public PokemonTypeDaoInMemory() {
		super();
		pokemonTypes = new ArrayList<>();
		pokemonTypes.add(new PokemonType(1, "Bug", null, null));
		pokemonTypes.add(new PokemonType(2, "Fire", null, null));
		pokemonTypes.add(new PokemonType(3, "Ghost", null, null));
		pokemonTypes.add(new PokemonType(4, "Water", null, null));
		pokemonTypes.add(new PokemonType(5, "Flying", null, null));
		pokemonTypes.add(new PokemonType(6, "Grass", null, null));
		pokemonTypes.add(new PokemonType(7, "Electric", null, null));

		pokemonTypes.get(0).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(5) }));
		pokemonTypes.get(0).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(4), pokemonTypes.get(1) }));

		pokemonTypes.get(1).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(1), pokemonTypes.get(5), pokemonTypes.get(0) }));
		pokemonTypes.get(1).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(3) }));

		pokemonTypes.get(2).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(0), pokemonTypes.get(2) }));
		pokemonTypes.get(2).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(2) }));

		pokemonTypes.get(3).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(1), pokemonTypes.get(3) }));
		pokemonTypes.get(3).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(5), pokemonTypes.get(6) }));

		pokemonTypes.get(4).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(5), pokemonTypes.get(0) }));
		pokemonTypes.get(4).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(6) }));

		pokemonTypes.get(5).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(5), pokemonTypes.get(3), pokemonTypes.get(6) }));
		pokemonTypes.get(5).setWeaknesses(Arrays.asList(new PokemonType[] { pokemonTypes.get(1), pokemonTypes.get(0), pokemonTypes.get(4) }));

		pokemonTypes.get(6).setResistances(Arrays.asList(new PokemonType[] { pokemonTypes.get(4), pokemonTypes.get(6) }));
		pokemonTypes.get(6).setWeaknesses(Arrays.asList(new PokemonType[] {}));
	}

	@Override
	public int save(PokemonType pokemonType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PokemonType> findAll() {
		return pokemonTypes;
	}

	@Override
	public PokemonType findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
