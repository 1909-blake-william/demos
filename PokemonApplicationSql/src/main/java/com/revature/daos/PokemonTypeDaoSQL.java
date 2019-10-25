package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.PokemonType;
import com.revature.util.ConnectionUtil;

public class PokemonTypeDaoSQL implements PokemonTypeDao {
	private Logger log = Logger.getRootLogger();

	List<PokemonType> extractTypes(ResultSet rs) throws SQLException {
		List<PokemonType> types = new ArrayList<>();

		while (rs.next()) {
			String name = rs.getString("name");
			int id = rs.getInt("pokemon_types_id");
			types.add(new PokemonType(id, name, null, null));
		}

		return types;
	}

	@Override
	public int save(PokemonType pokemonType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PokemonType> findAll() {
		log.debug("attempting to find all pokemon from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon_types";

			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			return extractTypes(rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
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

	@Override
	public List<PokemonType> findResistances(int typeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PokemonType> findWeaknesses(int typeId) {
		log.debug("attempting to find all pokemon from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT name, pokemon_types_id FROM pokemon_weaknesses w "
					+ "LEFT JOIN pokemon_types t ON (t.pokemon_types_id = w.weakness_id) "
					+ "WHERE pokemon_type_id = ?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, typeId);

			ResultSet rs = ps.executeQuery();

			return extractTypes(rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
