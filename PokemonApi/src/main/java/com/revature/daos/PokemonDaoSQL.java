package com.revature.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Pokemon;
import com.revature.models.PokemonType;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class PokemonDaoSQL implements PokemonDao {

	private Logger log = Logger.getRootLogger();

	Pokemon extractPokemon(ResultSet rs) throws SQLException {
		int id = rs.getInt("pokemon_id");
		String name = rs.getString("pokemon_name");
		int hp = rs.getInt("hp");
		int level = rs.getInt("pokemon_level");
		int typeId = rs.getInt("pokemon_type_id");
		String typeName = rs.getString("name");
		int trainerId = rs.getInt("trainer");
		String trainerName = rs.getString("username");
		String trainerRole = rs.getString("role");
		return new Pokemon(id, name, level, hp, new PokemonType(typeId, typeName, null, null),
				new User(trainerId, trainerName, null, trainerRole));
	}

	@Override
	public int save(Pokemon p) {
		log.debug("creating a new pokemon");
		try (Connection c = ConnectionUtil.getConnection()) {
			CallableStatement cs = c.prepareCall("call create_pokemon(?,?,?,?,?,?)");
			cs.setString(1, p.getName());
			cs.setInt(2, p.getHealthPoints());
			cs.setInt(3, p.getLevel());
			cs.setInt(4, p.getType().getId());
			cs.setInt(5, p.getTrainer().getId());

			cs.registerOutParameter(6, Types.INTEGER);
			cs.execute();

			int generatedId = cs.getInt(6);
			log.debug("generated pokemon id is: " + generatedId);
			return generatedId;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Pokemon> findAll() {
		log.debug("attempting to find all pokemon from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon p "
					+ "LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id) "
					+ "LEFT JOIN pokemon_users u ON (p.trainer = u.user_id)";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			List<Pokemon> pokemon = new ArrayList<>();
			while (rs.next()) {
				pokemon.add(extractPokemon(rs));
			}

			return pokemon;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Pokemon findById(int id) {
		log.debug("attempting to find pokemon by id from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon_joined_data " + "WHERE pokemon_id = ? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractPokemon(rs);
			} else {
				return null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void release(int pokemonId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pokemon> findByName(String name) {
		log.debug("attempting to find pokemon by name from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon p "
					+ "LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id) "
					+ "LEFT JOIN pokemon_users u ON (p.trainer = u.user_id) " + "WHERE pokemon_name = ?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			List<Pokemon> pokemon = new ArrayList<>();
			while (rs.next()) {
				pokemon.add(extractPokemon(rs));
			}

			return pokemon;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Pokemon> findByTypeId(int typeId) {
		log.debug("attempting to find pokemon by type from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon p "
					+ "LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id) "
					+ "LEFT JOIN pokemon_users u ON (p.trainer = u.user_id) " + "WHERE pokemon_type_id = ?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, typeId);

			ResultSet rs = ps.executeQuery();
			List<Pokemon> pokemon = new ArrayList<>();
			while (rs.next()) {
				pokemon.add(extractPokemon(rs));
			}

			return pokemon;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Pokemon> findByTrainerName(String name) {
		log.debug("attempting to find pokemon by trainer name from DB");
		try (Connection c = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM pokemon p "
					+ "LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id) "
					+ "LEFT JOIN pokemon_users u ON (p.trainer = u.user_id) " + "WHERE username = ?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			List<Pokemon> pokemon = new ArrayList<>();
			while (rs.next()) {
				pokemon.add(extractPokemon(rs));
			}

			return pokemon;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
