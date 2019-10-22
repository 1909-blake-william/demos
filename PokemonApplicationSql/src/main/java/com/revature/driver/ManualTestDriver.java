package com.revature.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.daos.PokemonTypeDaoInMemory;
import com.revature.daos.PokemonTypeDaoSerialization;
import com.revature.util.ConnectionUtil;

public class ManualTestDriver {
	public static void main(String[] args) {

		
		try(Connection c = ConnectionUtil.getConnection()) {
			
			PreparedStatement ps = c.prepareStatement("SELECT * FROM pokemon");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("pokemon_name"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
