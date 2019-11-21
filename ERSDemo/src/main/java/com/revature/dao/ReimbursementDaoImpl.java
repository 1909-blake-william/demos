package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Reimbursement;
import com.revature.model.ReimbursementForm;
import com.revature.model.ReimbursementStatus;
import com.revature.util.ConnectionFactory;
import com.revature.util.Exceptions;

public class ReimbursementDaoImpl implements ReimbursementDao {
	
	private static final ReimbursementDao instance = new ReimbursementDaoImpl();
	
	private ReimbursementDaoImpl() {}

	private static final String FIND_ALL = "SELECT * FROM reimbursements";
	private static final String FIND_ALL_BY_USERNAME = FIND_ALL + " WHERE username = ?";
	private static final String FIND_ALL_BY_STATUS = FIND_ALL + " WHERE status = ?";
	private static final String FIND_BY_ID = "SELECT * FROM reimbursements WHERE id = ?";
	private static final String INSERT_REIMBURSEMENT = "INSERT INTO reimbursements "
			+ "(id, amount, created_by, r_type, description, created_on, status) "
			+ "VALUES (REIMB_SEQ.nextval, ?, ?, ?, ?, CURRENT_TIMESTAMP, 0)";
	private static final String RESOLVE = "UPDATE reimbursements "
			+ "SET status = ?, resolved_by = ?, resolved_on = ?"
			+ " WHERE id = ?";

	@Override
	public List<Reimbursement> findAll() {
		List<Reimbursement> reimbursements = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(FIND_ALL);
			while (rs.next()) {
				reimbursements.add(extract(rs));
			}
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		}
		return reimbursements;
	}

	@Override
	public List<Reimbursement> findAll(String username) {
		List<Reimbursement> reimbursements = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(FIND_ALL_BY_USERNAME);
			int index = 0;
			stmt.setString(++index, username);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				reimbursements.add(extract(rs));
			}
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		}
		return reimbursements;
	}

	@Override
	public List<Reimbursement> findAll(ReimbursementStatus status) {
		List<Reimbursement> reimbursements = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(FIND_ALL_BY_STATUS);
			int index = 0;
			stmt.setInt(++index, status.ordinal());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				reimbursements.add(extract(rs));
			}
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		}
		return reimbursements;
	}

	@Override
	public boolean create(ReimbursementForm reim) {
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(INSERT_REIMBURSEMENT);
			int index = 0;
			stmt.setDouble(++index, reim.getAmount());
			stmt.setString(++index, reim.getCreatedBy());
			stmt.setInt(++index, reim.getType().ordinal());
			stmt.setString(++index, reim.getDescription());
			return stmt.executeUpdate() == 1;
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		}
		return false;
	}

	@Override
	public Reimbursement resolve(Reimbursement reim, ReimbursementStatus status) {
		try (Connection conn = ConnectionFactory.getConnection()) {
			Reimbursement r = findOne(reim.getId());
			// Managers should not be able to resolve their own expenses
			if (r.getCreatedBy().equals(reim.getResolvedBy())) {
				return null;
			}
			PreparedStatement stmt = conn.prepareStatement(RESOLVE);
			int index = 0;
			Timestamp resolvedOn = new Timestamp(System.currentTimeMillis()); 
			stmt.setInt(++index, status.ordinal());
			stmt.setString(++index, reim.getResolvedBy());
			stmt.setTimestamp(++index, resolvedOn);
			stmt.setInt(++index, reim.getId());
			if (stmt.executeUpdate() == 1) {
				r.setResolvedBy(reim.getResolvedBy());
				r.setStatus(status);
				r.setResolvedOn(resolvedOn);
				return r;
			}
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		}
		return null;
	}
	
	@Override
	public Reimbursement findOne(int id) {
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(FIND_BY_ID);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return extract(rs);
			}
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
		} 
		return null;
	}
	
	private static Reimbursement extract(ResultSet rs) throws SQLException {
		return new Reimbursement(
					rs.getInt("id"),
					rs.getDouble("amount"),
					rs.getString("description"),
					rs.getInt("status"),
					rs.getInt("r_type"),
					rs.getString("created_by"),
					rs.getString("resolved_by"),
					rs.getTimestamp("created_on"),
					rs.getTimestamp("resolved_on")
				);
	}
	
	public static ReimbursementDao getInstance() {
		return instance;
	}

}



















