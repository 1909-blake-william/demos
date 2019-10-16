package com.revature.driver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.revature.daos.PokemonTypeDaoInMemory;
import com.revature.daos.PokemonTypeDaoSerialization;
import com.revature.models.PokemonType;

public class ManualTestDriver {
	public static void main(String[] args) {
		PokemonTypeDaoSerialization serialDao = new PokemonTypeDaoSerialization();
		PokemonTypeDaoInMemory inMemory = new PokemonTypeDaoInMemory();
		
//		List<PokemonType> fromMemory = inMemory.findAll();
//
//		for (PokemonType type : fromMemory) {
//			serialDao.save(type);
//		}
		
		System.out.println(serialDao.findAll());
		
	}
}
